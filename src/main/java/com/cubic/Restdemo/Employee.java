package com.cubic.Restdemo;


/////////// Entity  class for Employee/////////////////
public class Employee {

    private  String id;
    private String name;
    private String gender;

    // constructor
    public Employee(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    //getter & setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
