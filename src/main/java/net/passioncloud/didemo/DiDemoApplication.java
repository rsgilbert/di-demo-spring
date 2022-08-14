package net.passioncloud.didemo;

import net.passioncloud.didemo.controllers.ConstructorInjectedController;
import net.passioncloud.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.passioncloud.didemo.controllers.MyController;
import net.passioncloud.didemo.controllers.PropertyInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        // The bean is created by Spring Framework
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

		// property injected controller
		PropertyInjectedController pController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		print(pController.sayHello());

		// setter injected controller
		SetterInjectedController sController = ctx.getBean(SetterInjectedController.class);
		System.out.println(SetterInjectedController.class);
		print(sController.sayHello());

		// constructor injected controller
		ConstructorInjectedController cController = ctx.getBean(ConstructorInjectedController.class);
		print(cController.sayHello());
	}
	
	static void print(String msg) {
		System.out.println("MSG: " + msg);
	}

}
