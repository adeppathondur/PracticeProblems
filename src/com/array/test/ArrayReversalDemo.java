package com.array.test;

import java.util.Arrays;

public class ArrayReversalDemo {

    public static int [] reverse(int [] num){
        if(num ==null || num.length<=1){
            return null;
        }
        for(int i=0; i<num.length/2; i++){
            int tmp = num[i];
            num[i]=num[num.length-1-i];
            num[num.length-1-i]=tmp;
        }
        return num;
    }

    public static void main(String[] args) {
        int b[]={3,4,5,6};
        System.out.println(Arrays.toString(reverse(b)));
    }
}
