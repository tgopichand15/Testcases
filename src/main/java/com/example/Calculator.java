
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

    public int sub(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }

    public int div(int a,int b){
        return a/b;
    }


    public int[] returnArray(int[] a){
        return a;
    }


}