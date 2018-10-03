package com.cosyit.myspring.第02天;

//利用构造方法注入，对bean进行赋值。
public class Car {
    //品牌
    private String brand;

    //厂家
    private String corp;

    //价格
    private double price;

    //最大速度
    private int maxSpeed;


    //在这里不提供getter,setter,只提供构造器，看看spring 利用构造器如何为我们进行bean的初始化。


    public Car(String brand, String corp, double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
