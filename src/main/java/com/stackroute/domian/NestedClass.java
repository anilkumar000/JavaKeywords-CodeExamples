package com.stackroute.domian;

public class NestedClass {
    int x = 20;

    //inner class
    public class InnerClass {
        public void print() {
            System.out.println("Acessing class variable" + x);
        }
//        Nested class
        public class Nested {
            public void show() {
                print();
            }

        }
    }
}
