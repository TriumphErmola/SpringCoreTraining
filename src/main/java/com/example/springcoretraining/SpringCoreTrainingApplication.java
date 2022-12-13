package com.example.springcoretraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreTrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreTrainingApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee employee3 = context.getBean("employee",Employee.class);

        System.out.println(employee3);

        context.close();


    }

}
