export JAVA_OPTS='-javaagent:/home/david/appdynamics/agent/javaagent.jar -Dappdynamics.controller.hostName=localhost -Dappdynamics.controller.port=8090 -Dappdynamics.agent.applicationName=AkkaDemo -Dappdynamics.agent.tierName=ScalaTier2 -Dappdynamics.agent.nodeName=ScalaNode2 -Dappdynamics.agent.runtime.dir=/home/david -Dappdynamics.agent.accountName=customer1 -Dappdynamics.agent.accountAccessKey=000269d8-51b1-4003-9e69-2a8b82a9184b  -Dconfig.file=/home/david/appdynamics/scala/activator-play-cluster-sample/frontend/conf/application.conf -Dcom.sun.management.jmxremote -classpath /home/david/appdynamics/scala/activator-play-cluster-sample/out/artifacts/unnamed/unnamed.jar'
sbt "project frontend" run
