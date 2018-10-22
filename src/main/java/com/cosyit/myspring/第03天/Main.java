package com.cosyit.myspring.第03天;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:第03天applicationContext.xml");

       Person person =  ctx.getBean("person",Person.class);
        System.out.println(person);

        Person person1 = ctx.getBean("person1",Person.class);
        System.out.println(person1);
    }
}
