
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator{

    public TrignometricFunctions tf;

    @Autowired
    public Calculator(TrignometricFunctions tf){
        this.tf=tf;
    }

    public int add(int a,int b){
        return a+b;
    }


    public static int static_addition(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }

    public int div(int a,int b){
        return a/b;
    }

    public double cosine(double value){
        return tf.cosine(value);
    }


    public int[] returnArray(int[] a){
        return a;
    }


    public int staticTestinDependentClass(int a,int b) {
        return TrignometricFunctions.add(1,1);
    }


}