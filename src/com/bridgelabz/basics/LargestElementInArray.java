package com.bridgelabz.basics;

public class LargestElementInArray {
    public static void main(String[] args) {
        int [] arr1=new int[5];
        arr1[0]=2;
        arr1[1]=2;
        arr1[2]=6;
        arr1[3]=8;
        arr1[4]=6;
        int max=arr1[0];
        for(int i=0;i<arr1.length;i++){

           if(arr1[i]>max){
               max=arr1[i];
           }

        }
        System.out.println("Largest number is " + max);
    }
}
