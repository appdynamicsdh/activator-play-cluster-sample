export JAVA_OPTS='-javaagent:/home/david/javaagent.jar -Dappdynamics.controller.hostName=localhost -Dappdynamics.controller.port=8090 -Dappdynamics.agent.applicationName=AkkaDemo -Dappdynamics.agent.tierName=ScalaT1 -Dappdynamics.agent.nodeName=Scala1 -Dappdynamics.agent.runtime.dir=/home/david -Dappdynamics.agent.accountName=customer1 -Dappdynamics.agent.accountAccessKey=000269d8-51b1-4003-9e69-2a8b82a9184b'
sbt "backend/run 2551"

