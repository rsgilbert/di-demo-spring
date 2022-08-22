package net.passioncloud.didemo;

//import net.passioncloud.didemo.controllers.ConstructorInjectedController;
import net.passioncloud.didemo.controllers.ConstructorInjectedController;
import net.passioncloud.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.passioncloud.didemo.controllers.MyController;
import net.passioncloud.didemo.controllers.PropertyInjectedController;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		// constructor injected controller
		ConstructorInjectedController cController = ctx.getBean(ConstructorInjectedController.class);
		print(cController.sayHello());

		ConstructorInjectedController controller2 = ctx.getBean(ConstructorInjectedController.class);
		print(controller2.sayHello());

		SetterInjectedController sController = ctx.getBean(SetterInjectedController.class);
		print(sController.sayHello());

		SetterInjectedController sController2 = ctx.getBean(SetterInjectedController.class);
		print(sController2.sayHello());
	}
	
	static void print(String msg) {
		System.out.println("MSG: " + msg);
	}

}
