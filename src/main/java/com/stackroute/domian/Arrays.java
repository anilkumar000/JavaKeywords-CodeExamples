package com.stackroute.domian;
//Class for Arrays Implementation
public class Arrays {
//    method for Int[]
    public void intArray(int[] x){
//        getting length of array
        System.out.println(x.length);
//        cloning an array into another
        int[] y=x.clone();
        System.out.println(y.length+"(cloned element)");
    }

//    method for String[]
    public void stringArray(String[] x){
        //        getting length of array
        System.out.println(x.length);
        //        cloning an array into another
        String[] y=x.clone();
        System.out.println(y.length+"(cloned element)");
    }

//    method for multiDimensional Arrays
    public void multiDimensionalArray(int[][] x){
//        Printing a MultiDimensional array
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

