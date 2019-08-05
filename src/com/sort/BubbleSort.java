package com.sort;

public class BubbleSort {
    public static void bubbleSort (int[] array){
        for(int i=0; i<array.length; i++)
        {
            boolean flag = false;
            for(int j=0; j<array.length-i-1; j++)
            {
                if(array[j]>array[j+1])
                {
                    flag = true;
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            // No Swapping happened, array is sorted
            if(!flag){
                return;
            }
        }

    }

    public static void main(String[] args) {

    }
}
