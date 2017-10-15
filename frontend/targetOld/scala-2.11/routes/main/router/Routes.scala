
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/david/appdynamics/scala/activator-play-cluster-sample/frontend/conf/routes
// @DATE:Sun Oct 01 21:53:09 EDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """controllers.Application.index"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jsroutes.js""", """controllers.Application.jsRoutes()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/info""", """controllers.BuildInfoController.info"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/cluster/nodes""", """controllers.Cluster.clusterNodesWebsocket"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/cluster/metrics""", """controllers.Cluster.clusterMetricsWebsocket"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/services/factorial""", """controllers.services.Factorial.websocket"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_jsRoutes1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jsroutes.js")))
  )
  private[this] lazy val controllers_Application_jsRoutes1_invoker = createInvoker(
    controllers.Application.jsRoutes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "jsRoutes",
      Nil,
      "GET",
      """ JavaScript routes object""",
      this.prefix + """jsroutes.js"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BuildInfoController_info2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/info")))
  )
  private[this] lazy val controllers_BuildInfoController_info2_invoker = createInvoker(
    controllers.BuildInfoController.info,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuildInfoController",
      "info",
      Nil,
      "GET",
      """""",
      this.prefix + """api/info"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Cluster_clusterNodesWebsocket3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cluster/nodes")))
  )
  private[this] lazy val controllers_Cluster_clusterNodesWebsocket3_invoker = createInvoker(
    controllers.Cluster.clusterNodesWebsocket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Cluster",
      "clusterNodesWebsocket",
      Nil,
      "GET",
      """""",
      this.prefix + """api/cluster/nodes"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Cluster_clusterMetricsWebsocket4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cluster/metrics")))
  )
  private[this] lazy val controllers_Cluster_clusterMetricsWebsocket4_invoker = createInvoker(
    controllers.Cluster.clusterMetricsWebsocket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Cluster",
      "clusterMetricsWebsocket",
      Nil,
      "GET",
      """""",
      this.prefix + """api/cluster/metrics"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_services_Factorial_websocket5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/services/factorial")))
  )
  private[this] lazy val controllers_services_Factorial_websocket5_invoker = createInvoker(
    controllers.services.Factorial.websocket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.services.Factorial",
      "websocket",
      Nil,
      "GET",
      """""",
      this.prefix + """api/services/factorial"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_versioned6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
      }
  
    // @LINE:9
    case controllers_Application_jsRoutes1_route(params) =>
      call { 
        controllers_Application_jsRoutes1_invoker.call(controllers.Application.jsRoutes())
      }
  
    // @LINE:14
    case controllers_BuildInfoController_info2_route(params) =>
      call { 
        controllers_BuildInfoController_info2_invoker.call(controllers.BuildInfoController.info)
      }
  
    // @LINE:15
    case controllers_Cluster_clusterNodesWebsocket3_route(params) =>
      call { 
        controllers_Cluster_clusterNodesWebsocket3_invoker.call(controllers.Cluster.clusterNodesWebsocket)
      }
  
    // @LINE:16
    case controllers_Cluster_clusterMetricsWebsocket4_route(params) =>
      call { 
        controllers_Cluster_clusterMetricsWebsocket4_invoker.call(controllers.Cluster.clusterMetricsWebsocket)
      }
  
    // @LINE:17
    case controllers_services_Factorial_websocket5_route(params) =>
      call { 
        controllers_services_Factorial_websocket5_invoker.call(controllers.services.Factorial.websocket)
      }
  
    // @LINE:24
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(controllers.Assets.versioned(path, file))
      }
  }
}