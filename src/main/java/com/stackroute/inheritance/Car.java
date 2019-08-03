package com.stackroute.inheritance;
//Car Abstract class with some normal methods and Abstract methods
public abstract class Car implements Vehicle {

    public void steering(){
        System.out.println("Every car has a steering");
    }
//    abstract class
    public abstract void numberOfGears();

//    method in vehicle
    @Override
    public void speed() {
        System.out.println("Each car different speeds");
    }
}
