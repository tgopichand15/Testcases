package com.example;

import org.springframework.stereotype.Component;

import java.lang.Math;

@Component
public class TrignometricFunctions {

    public double sine(double value){
        return Math.sin(value);
    }

    public double cosine(double value){
        return Math.cos(value);
    }

    public double tan(double value){
        return Math.tan(value);
    }

    public static int add(int a,int b){
        return a+b;
    }



}

