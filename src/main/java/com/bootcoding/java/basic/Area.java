package com.bootcoding.java.basic;//Write a function that takes the base and height of a triangle and return its area.
//The area of a triangle is: (base * height) / 2 Don't forget to return the result.

public class Area {
    public static void main(String[] args) {

        double res = 0;
        res = findAreaOfTriangle();
        System.out.println("Area of a triangle is:" + res);
    }

    public static double findAreaOfTriangle() {
        int base = 5;
        int height = 10;
        double AreaOfTriangle = (base * height) / 2;

        System.out.println(AreaOfTriangle);
        return (AreaOfTriangle);
    }
}
 