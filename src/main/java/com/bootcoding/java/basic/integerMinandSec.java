package com.bootcoding.java.basic;//. Write a method that takes an integer minutes and converts it to seconds.
//For Example 1:
//Input: 5
//Output: 300
//Description: convert(5) → 300

import java.sql.SQLOutput;

public class integerMinandSec {
    public static void main(String[] args) {
        int res=0;
        res = convertMintoSec();
        System.out.println("Convert(5)->" + res);
    }

    public static int convertMintoSec() {
            int min = 5;
            int sec = 60;
            min = min * sec;
            sec = min;
            return sec;
        }
    }
