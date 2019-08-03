package com.stackroute.domian;

public class ConstructorAndThisKeyWordImplementation {


        private String name;
        private int age;
        private int id;


    public ConstructorAndThisKeyWordImplementation(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public ConstructorAndThisKeyWordImplementation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ConstructorAndThisKeyWordImplementation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

