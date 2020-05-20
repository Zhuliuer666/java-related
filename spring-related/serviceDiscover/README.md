This project is for a simple consul producer and consumer
#
# producer
the serviceProducer.jar is for producer <br>
you can start the service via "java -Dserver.port=8501/8502 -jar serviceProducer.jar"
 to set up two producer<br>
 the producer has exposed one endpoint "/hello"  which would 
 return its service name and port
 
# consumer
 1)use "mvn clean install" to build project
 2)java -jar source.jar(which would be in targer folder)
 its default port is 8503, one endpoint is "/hello" which would 
 call producer
 
# consul
 for your local set up, please refer to [consul](https://learn.hashicorp.com/consul/getting-started/install)
 <br>
 
