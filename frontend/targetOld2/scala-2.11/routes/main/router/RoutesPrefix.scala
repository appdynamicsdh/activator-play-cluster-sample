
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/david/appdynamics/scala/activator-play-cluster-sample/frontend/conf/routes
// @DATE:Thu Oct 05 20:52:18 EDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
