package com.bootcoding.java.basic;

public class ArithmeticEx5 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
//hard coding string + variable
        System.out.println("The value of a is " + a);
        int b = 20;
        int c = a + b;
        System.out.println(c);
        System.out.println(a + b);
        System.out.println("The value of " + a + " and " + b + " is " + (a + b));

        boolean res1 = 10 > 20;
        boolean res2 = 10.5 != 11.5;
        boolean res3 = 'A' == 'A';
        boolean res4 = true != false;
        System.out.println("10 > 20 is" + res1);
        System.out.println("10.5!=11.5 is " + res2);
        System.out.println("A = A is" + res3);
        System.out.println("true!= false is " + res4);
    }
}