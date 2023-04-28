package com.bootcoding.java.basic;

public class Methodex1{
  public static void  main(String[]args){
  calcAvgAndPercentage();
}
  private static void calcAvgAndPercentage(){
  int m1=75;
  int m2=62;
  int m3=57;
 double percentage=0.0;
 double average=0.0;  
     int sum=m1+m2+m3;
     average=sum/3.0;
     percentage=sum/300.00*100.00;
  System.out.println("AVG Marks:" +average);
 System.out.println("Percentage Marks:" +percentage);
  }
  }
  