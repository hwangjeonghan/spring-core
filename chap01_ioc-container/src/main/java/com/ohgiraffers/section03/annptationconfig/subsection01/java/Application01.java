package com.ohgiraffers.section03.annptationconfig.subsection01.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application01 {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beansNames = context.getBeanDefinitionNames();
        for (String name : beansNames) {
            System.out.println("beanName: " + name);
        }
    }
}
