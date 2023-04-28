package com.bootcoding.java.basic;
//WAP to find max element of an array using method

public class MaxElement{
    public static void main (String[] args) {
        int arr[]={10,2,19,-34,20,0,199};
        int res=0;
        res=findMaxElement(arr);
        System.out.println("The Maximum Element is "+res);
    }
    
    public static int findMaxElement(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
            max = arr[i];

        }
    }
    System.out.println(max);
    return(max);
 }
}