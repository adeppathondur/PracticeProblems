package com.array.test;

import java.util.Arrays;

public class MergeTwoSortedArr {

    public static void merge1(int [] arr1, int [] arr2){
        int s1=arr1.length;
        int s2 = arr2.length;
        int res []=new int[s1+s2];
        int i = 0, j = 0, k = 0;
        while(i < s1 && j< s2){
            if(arr1[i] < arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;

            }else {
                res[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i< s1){
            res[k++]=arr1[i++];
        }
        while (j < s2){
            res[k++]= arr2[j++];
        }
        System.out.println(Arrays.toString(res));

    }
    public static void merge2(int [] arr1, int [] arr2){

    }

    public static void main(String[] args) {

    }
}
