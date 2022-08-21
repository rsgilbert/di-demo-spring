package net.passioncloud.didemo;

//import net.passioncloud.didemo.controllers.ConstructorInjectedController;
import net.passioncloud.didemo.controllers.ConstructorInjectedController;
import net.passioncloud.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.passioncloud.didemo.controllers.MyController;
import net.passioncloud.didemo.controllers.PropertyInjectedController;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"net.passioncloud.services","net.passioncloud.didemo"})
@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		// constructor injected controller
		ConstructorInjectedController cController = ctx.getBean(ConstructorInjectedController.class);
		print(cController.sayHello());
	}
	
	static void print(String msg) {
		System.out.println("MSG: " + msg);
	}

}
