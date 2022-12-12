package com.example.springcoretraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreTrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreTrainingApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        Employee employee1 = context.getBean("welder", Welder.class);
//        employee1.sayYourInfo();
//
//        Employee employee2 = context.getBean("adjuster", Adjuster.class);
//        employee2.sayYourInfo();

        Employee employee3 = context.getBean("employee",Employee.class);

        employee3.sayYourInfo();


        context.close();


    }

}
