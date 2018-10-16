package com.cosyit.myspring.第02天;

import java.util.List;

public class Boss {

    private String name;
    private String age;
    private List<Car> cars;

    public Boss(String name, String age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public Boss() {
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
