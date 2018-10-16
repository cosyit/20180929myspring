package com.cosyit.myspring.第02天;

public class CommonPerson {

    private String name;
    private String age;
    private Car car;

    public CommonPerson(String name, String age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public CommonPerson() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
