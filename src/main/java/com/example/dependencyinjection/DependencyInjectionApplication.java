package com.example.dependencyinjection;

import com.example.dependencyinjection.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(...): This static method initializes the Spring context,
		 starts the embedded Tomcat server (if required), and returns the Spring 'ApplicationContext' */
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		/*context.getBean(...): This method retrieves an instance of the specified bean (MyController in this case)
		 from the Spring context.*/
		MyController controller = context.getBean(MyController.class);

		System.out.println("I am in Main Method");

		System.out.println(controller.sayHello());

	}

}
