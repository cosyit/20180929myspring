package com.cosyit.myspring.第01天;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private final static Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        // todo : 使用spring之后第一步和第2步交给spring去做。
//        //第一步：创建对象
//        HelloWorld helloWorld =  new HelloWorld();
//        //第二步：给对象赋值
//        helloWorld.setName("david teacher");
//
//        helloWorld.sayHelloWorld();

        /**
         * -----------------------------当我们使用spring之后的做法--------------------------------------
         */
        // 001. 先加载applicaitonContext.xml文件。
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:第01天applicationContext.xml");

        
        // 002. 调用无参构造函数，构造bean.
        HelloWorld helloWorld1 = ctx.getBean("helloWorld",HelloWorld.class);

        //003. 调用setProperty 进行初始化。出我们需要得对象。

        //004. 对象.方法();
        helloWorld1.sayHelloWorld();
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
