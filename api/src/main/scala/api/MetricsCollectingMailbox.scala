package api

import java.util.concurrent.ConcurrentLinkedQueue

import akka.actor.{Props, Actor, ActorSystem, ActorRef}

import akka.dispatch.{MailboxType, ProducesMessageQueue, Envelope, MessageQueue}

import com.typesafe.config.Config

import org.slf4j.Logger
import org.slf4j.LoggerFactory

trait MyUnboundedMessageQueueSemantics

// This is the MessageQueue implementation
class MyMessageQueue extends MessageQueue
{

  private final val queue = new ConcurrentLinkedQueue[(Long,Envelope)]()

  // these should be implemented; queue used as example
  def enqueue(receiver: ActorRef, handle: Envelope): Unit = {

    val timestamp = (System.nanoTime(), handle)
    queue.offer(timestamp)

  }

  def dequeue(): Envelope ={
    val timestamp = queue.poll
    val logger = LoggerFactory.getLogger(classOf[MyMessageQueue])
    if(timestamp!=null) {
      logMessage(System.nanoTime() - timestamp._1)
      timestamp._2
    }else{
      null
    }
  }

  def logMessage(timeStamp: java.lang.Long) = {
    //val logger = LoggerFactory.getLogger(classOf[MyMessageQueue])
    //logger.error(timeStamp.toString);
    timeStamp
  }

  def numberOfMessages: Int = queue.size
  def hasMessages: Boolean = !queue.isEmpty
  def cleanUp(owner: ActorRef, deadLetters: MessageQueue) {
    while (hasMessages) {
      deadLetters.enqueue(owner, dequeue())
    }
  }
}

class MyUnboundedMailbox extends MailboxType
  with ProducesMessageQueue[MyMessageQueue] {

  // This constructor signature must exist, it will be called by Akka
  def this(settings: ActorSystem.Settings, config: Config) = {
    // put your initialization code here
    this()
  }

  // The create method is called to create the MessageQueue
  final override def create(owner: Option[ActorRef],
                            system: Option[ActorSystem]): MessageQueue =
    new MyMessageQueue()
}