
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/david/appdynamics/scala/activator-play-cluster-sample/frontend/conf/routes
// @DATE:Thu Oct 05 20:52:18 EDT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:17
package controllers.services.javascript {
  import ReverseRouteContext.empty

  // @LINE:17
  class ReverseFactorial(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def websocket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.services.Factorial.websocket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/services/factorial"})
        }
      """
    )
  
  }


}