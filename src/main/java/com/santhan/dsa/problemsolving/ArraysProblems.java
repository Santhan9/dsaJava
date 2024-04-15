package com.santhan.dsa.problemsolving;

public class ArraysProblems {

    public static int[] removeEvenIntegersFromArray(int[] arr){
        int len = arr.length;
        int left = 0;
        int right = len-1;

        while(left!=right){
            if(arr[left]%2!=0){
                left++;
            }else{
                int temp = arr[right];
                arr[right]= arr[left];
                arr[left] = temp;
                right--;
            }
        }
        int[] res = new int[left+1];
        for(int i =0;i<=left;i++){
            res[i] = arr[i];

        }
        return res ;

    }
    public static int[] reverseArray(int[] arr){
        int len = arr.length;
        int left = 0;
        int right = len-1;
        while(left<=right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right --;
            left++;
        }
        return arr;

    }

    public static int  minValue(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }
        return min;
    }
}
