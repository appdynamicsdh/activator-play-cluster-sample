
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/david/appdynamics/scala/activator-play-cluster-sample/frontend/conf/routes
// @DATE:Sun Oct 01 21:53:09 EDT 2017

package controllers.services;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.services.ReverseFactorial Factorial = new controllers.services.ReverseFactorial(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.services.javascript.ReverseFactorial Factorial = new controllers.services.javascript.ReverseFactorial(RoutesPrefix.byNamePrefix());
  }

}
