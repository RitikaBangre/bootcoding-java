package com.bootcoding.java.basic;

public class ArithmeticEx6 {

    public static void main(String[] args) {

        System.out.println("PRE INCREMENT BY ONE");
        int preIncrement = 10;

        System.out.println("Initial value:" + preIncrement);

        int result = 10 + (++preIncrement);

        System.out.println("result(10+ (++preIncrement))=" + result);
    }

}
