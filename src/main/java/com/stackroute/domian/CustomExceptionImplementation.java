package com.stackroute.domian;

public class CustomExceptionImplementation {
    public void exceptionImplementation(int x) throws CustomException{
            if (x!=0)
                System.out.println(x);
            else throw new CustomException("Enter NonZero value");
    }
}
