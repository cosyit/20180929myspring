package com.cosyit.myspring.第01天;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloWorld {

    private static Log log = LogFactory.getLog(HelloWorld.class);

    private String name;

    public HelloWorld() {
        log.info("spring先加载xml配置，再调用无参构造器正在构造bean，如果没有无参构造器，spring无法工作");
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHelloWorld(){
        System.out.println(name +" say :Hello World!");
    }
}
