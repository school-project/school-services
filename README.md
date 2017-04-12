# school-services

Install code in local maven repository: 
Run mvn clean install for common-database-service, it must executed first as it’s dependency for other modules.
Run mvn clean install for school-service.

Run code with maven embedded tomcat and H2 in memory mode:
1.	run mvn tomcat6:run –Ptomcat for school-service.

Run code within IDE(Eclipse or Intellij):
1.	import project to IDE.
2.	create tomcat server and add the deployment, give VM option “-Dspring.profiles.active=dev-h2” which will run H2 database in memory mode with table/data setup.
  
