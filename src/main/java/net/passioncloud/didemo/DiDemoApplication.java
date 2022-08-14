package net.passioncloud.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.passioncloud.didemo.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        // The bean is created by Spring Framework
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();
	}

}
