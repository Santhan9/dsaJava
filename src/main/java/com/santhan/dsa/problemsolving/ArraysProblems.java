package com.santhan.dsa.problemsolving;

public class ArraysProblems {

    public static int[] removeEvenIntegersFromArray(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;

        while (left != right) {
            if (arr[left] % 2 != 0) {
                left++;
            } else {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                right--;
            }
        }
        int[] res = new int[left + 1];
        for (int i = 0; i <= left; i++) {
            res[i] = arr[i];

        }
        return res;

    }

    public static int[] reverseArray(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
        }
        return arr;

    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        return min;
    }

    public static int secondMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        int second_min= Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                second_min = min;
                min = arr[i];
            } else if (arr[i] < second_min && arr[i] != min) {
                second_min = arr[i];
            }
        }
        return second_min;
    }

    /*
    *
    * */
    public static  int missingNumber(int[] arr){
        int len = arr.length+1;
        int sumAct = len*(len+1)/2;
        int sum =0;

        for(int i=0;i<len-1;i++){
            sum+=arr[i];

        }
        return sumAct-sum;

    }

    /*
    * TC: O()
    * {1,0,4,7,0,6,5,9,6,11,18}
    * */
    public static  int[] moveZerosToEnd(int[] arr){

        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                swap(arr,i,j);
            }
            if(arr[j]!=0){
                j++;
            }
        }
        return arr;
    }

    public static  boolean ispalindrome(String s){
        char[] sc = s.toCharArray();
        int left = 0;
        int right = sc.length-1;

        while(left<right){
            if(sc[left]!=sc[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static int secondMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        return second_max;
    }


}
