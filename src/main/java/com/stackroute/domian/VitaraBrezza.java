package com.stackroute.domian;

import com.stackroute.inheritance.Car;

//A particular car class which extends main Car class
public class VitaraBrezza extends Car {
    String color;
    float price;
//    Constructor of a Particular class
    public VitaraBrezza(String color,float price) {
        this.color = color;
        this.price = price;
    }
//    method in this class
    public void chagingGear(){
        System.out.println("change speed when gears are changed");
    }
//override method of abstract class Car
    @Override
    public void numberOfGears() {
        System.out.println("this car has 5 gears");
    }
}
