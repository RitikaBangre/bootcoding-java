package com.bootcoding.java.basic;//WAP to find min element of an array using method

public class MinElement{
    public static void main(String[]args){
       int arr[]={10, 2, 19, -34, 20, 0, 199};
        int res=0;
      res=findMinElement(arr);
        System.out.println("The Minimum Element is" +res);
    }

    public static int findMinElement(int arr[]){
    int min = arr[0];
    for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
        min=arr.length;

        }
    }
    
    System.out.println(min);
    return (min);
    }

}