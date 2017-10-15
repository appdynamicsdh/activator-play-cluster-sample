package actors.services

import akka.actor._
import akka.routing.FromConfig
import akka.cluster.Cluster
import api.FactorialService._
import api.MyMessageQueue
import kamon.Kamon

/**
 * The connection point between frontend and  cluster
 */
class FactorialService extends Actor with ActorLogging {

  /** creating the cluster router  */
  val backend = context.actorOf(FromConfig.props(), name = "factorialWorkerRouter")

  def receive = {
    case msg @ Compute(n) => backend forward msg // keeping the reference to the actual websocket
  }
}

/**
 * Use in Global.scala to boostrap the FactorialService frontend
 */
object FactorialService {

  /**
   * Startup the service only if the cluster has the specified size
   */
  def startOn(system: ActorSystem) {
    Kamon.start()
    Cluster(system) registerOnMemberUp {
      val service = system.actorOf(Props[FactorialService], name = "factorialService")
      system.log info s"Factorial Service started at ${service.path}"
    }
  }
}
