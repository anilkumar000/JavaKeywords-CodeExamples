package com.stackroute.domian;

public class CustomException extends Exception {
    String messsage;

    public CustomException(String messsage) {
        super(messsage);
        this.messsage = messsage;
    }
}
