package com.cosyit.myspring.第02天;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.NumberFormat;
import java.time.LocalDate;

//大概看看，工厂模式方面的东西。未深入。
//就此，在此处留下了一个未完成的情节。就是菜鸟网上的23种设计模式的探究。
public class Main {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());//静态方法使用情况1
//
//        //静态方法使用情况2：静态工厂方法
//        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
//        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
//        double x = 0.2;
//        System.out.println(currencyFormatter.format(x));
//        System.out.println(percentFormatter.format(x));

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:第02天applicationContext.xml");
        System.out.println(ctx);
        Car car0 = ctx.getBean("car0", Car.class);
        System.out.println(car0);

        Car car1 = ctx.getBean("car1", Car.class);
        System.out.println(car1);

        CommonPerson person02 = ctx.getBean("person02",CommonPerson.class);
        System.out.println(person02);
    }
}
