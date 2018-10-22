package com.cosyit.myspring.第03天;

import java.util.Map;

public class Person {

    private Car car;
    private String name;
    private Address address;
    private Map<String,String> personDetails;

    @Override
    public String toString() {
        return "Person{" +
                "car=" + car +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", personDetails=" + personDetails +
                '}';
    }

    public Map<String, String> getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(Map<String, String> personDetails) {
        this.personDetails = personDetails;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
