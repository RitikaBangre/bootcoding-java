package com.bootcoding.java.basic;

public class student {
    public static void main(String[] args) {
        int size = args.length;
        if (size <4) {
            System.out.println("Please provide proper input!");
        }
        else {
            String firstArgument =args[0];
            int marks1 = Integer.parseInt(args[1]);
            int marks2 = Integer.parseInt(args[2]);
            int marks3 = Integer.parseInt(args[3]);
            marks1=87;
            marks2=76;
            marks3=67;
            if (firstArgument.equals("avg")) {
                int sum = marks1 + marks2 + marks3;
                double avg = sum / 3;
                System.out.println("Average: " +avg);
            }
      else if (firstArgument.equals("Percentage"))
      {
                int sum = marks1 + marks2 + marks3;
                double Percentage = sum / 300.00 * 100;
                System.out.println("Percentage:" +Percentage);
            } else {
                System.out.println("Invalid input:");
            }
        }
    }
}