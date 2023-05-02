package com.bootcoding.java.basic;

public class factEx1{
	
   public static void main(String[]input){
   int n=Integer.parseInt(input[0]);
 int fact =1;
    
	for(int i=0;i<input.length;i++){
      int j=Integer.parseInt(input[i]);
       for(int k=1;k<=j;k++){
		   
		 fact=fact*k;
	}
	
	System.out.println("The factorial of the given number is "+ fact);
    fact =1;
	 
	    }
	 
	   }
	
	}