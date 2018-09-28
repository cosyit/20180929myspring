package com.cosyit.myspring.第1天;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private final static Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        // todo : 使用spring之后第一步和第2步交给spring去做。
        //第一步：创建对象
        HelloWorld helloWorld =  new HelloWorld();
        //第二步：给对象赋值
        helloWorld.setName("david teacher");
        helloWorld.setName("david teacher");
        helloWorld.setName("david teacher");
        helloWorld.setName("david teacher");
        helloWorld.setName("david teacher");
        helloWorld.setName("david teacher");
        helloWorld.setName("david teacher");
        helloWorld.setName("david teacher");
        helloWorld.setName("david teacher");

        helloWorld.sayHelloWorld();

        /**
         * -----------------------------当我们使用spring之后的做法--------------------------------------
         */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:第一天helloworldapplicationContext.xml");

        System.out.println(ctx);

        HelloWorld helloWorld1 = ctx.getBean("helloWorld",HelloWorld.class);
        helloWorld1.sayHelloWorld();
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
