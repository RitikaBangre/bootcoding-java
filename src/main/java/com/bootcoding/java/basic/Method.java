package com.bootcoding.java.basic;

public class Method {
    public static void main(String[] args) {
        methodExample();
    }

    private static void methodExample() {
        int m1 = 75;
        int m2 = 62;
        int m3 = 57;
        int per = 0;
        per = m1 + m2 + m3 / 100 * 3 * 100;
        System.out.println(per);
    }
}
  