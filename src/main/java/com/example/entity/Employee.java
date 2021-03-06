package com.example.entity;

import javax.persistence.Entity;

@Entity
public class Employee {

    int id;
    String name;
    Address address;

    public Employee(int id, String name) {
        System.out.println("*****************");
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmployeeDetails() {
        return  id + "_" + name + "_" + address.getAddressDetails();
    }
}
