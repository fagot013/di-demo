package com.alexm.spring.didemo;

import com.alexm.spring.didemo.controller.ConstructorInjectorController;
import com.alexm.spring.didemo.controller.MyController;
import com.alexm.spring.didemo.controller.PropertyInjectorController;
import com.alexm.spring.didemo.controller.SetterInjectorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        final ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");
        myController.hello();


        System.out.println(context.getBean(PropertyInjectorController.class).sayHello());
        System.out.println(context.getBean(SetterInjectorController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectorController.class).sayHello());
    }

}
