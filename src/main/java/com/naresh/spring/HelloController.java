package com.naresh.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	   @RequestMapping("/test/hello/")
	    public String index() {
		    System.out.println("This is spring application--Naresh");		   
	        return "Greetings from Spring Boot!  ---- Naresh at troubles";
	    }
	
}

/*Spring Boot  Date 28 Oct 2017
Spring tool suit has been installed in the eclipse used eclipse neon 3
Creating spring boot demo at Eclipse
http://www.adeveloperdiary.com/java/spring-boot/create-spring-boot-application-step-step/
Spring boot problem at eclipse
https://stackoverflow.com/questions/40132631/sockettimeoutexception-null-while-opening-new-spring-starter-project
To run the application right click on project .....Run as....Spring Boot App
Do the changes at code, Stop the server, which is red button above and 
right click on project....Run as....Spring Boot App
To get the jar file in the target folder  Project.....Run as....Maven Install
https://stackoverflow.com/questions/28192761/spring-maven-clean-error-the-requested-profile-pom-xml-could-not-be-activate
To run the jar file from command prompt (Stop the tomcat server at eclipse)
C:\EclipseWorkSpace29092017\SpringBootDemo>java -jar target/SpringBootDemo-0.0.1-SNAPSHOT.jar
This jar file is useful to deploy at docker image
Below video explains how to keep spring jar file in docker image
https://www.youtube.com/watch?v=FlSup_eelYE
*/

