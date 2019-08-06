package com.array.test;

import java.util.Arrays;

public class SmallestValueArray {
    public static void smallValue(int[] a){
        int j=a.length - 1;
        int i=0;
        int small=Integer.MAX_VALUE;
         while(i<=j){
             if(small > a[i]){
                 small = a[i];
             }
             if(small > a[j]){
                 small = a[j];
             }
             i++;
             j--;
         }
        System.out.println(small);

    }
    public static void main(String[] args) {

//        int arr[] = { 3, 5, 8, 4, 1, 9, -2 };
        int arr[] = { 3, 5, 8, 4, -10, 2, 1, 9, -2 };

        smallValue(arr);

        // print the sorted array
        System.out.println(Arrays.toString(arr));

    }
}
