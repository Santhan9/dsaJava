package com.santhan.dsa.problemsolving;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Problems {

    //Write a Java method that takes a list of integers as input and returns the sum of all even numbers
    public static int evenSum(List<Integer> li){
        return li.stream().filter(e->e%2==0).reduce((a,b)->a+b).orElse(0);
    }

    //Given a list of strings, write a Java method to find and return the longest string in the list.
    // If there are multiple strings with the same maximum length, return the first occurrence
    public static String longestString(List<String> li){
        return li.stream()
                .reduce((a, b) -> {
                    System.out.println("Comparing: " + a + " and " + b);
                    return a.length() >= b.length() ? a : b;
                }).orElse("");
    }

    public static List<Integer> squares(List<Integer> li){
        return li.stream().map(e->e*e).collect(Collectors.toList());
    }

    public static List<String> filterwithA(List<String> li){
      return   li.stream().filter(e->e.startsWith("a") ||e.startsWith("A")).collect(Collectors.toList());
    }

    public static int countOfDistintEvenNumbers(List<Integer> li){
        return (int) li.stream().filter(e->e%2==0).distinct().count();
    }

    public static Map<String,Long> countoccurances(String input){

       return Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }

    public static long countvalues(String input){
        return Arrays.stream(input.split("")).count();
    }

    public static String firstNonRepeatElement(String input){
      return   Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue() == 1)
              .findFirst().get().getKey();
    }

    public static List<String> findDuplicates(String input){
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


       return map.entrySet().stream().filter(e-> e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
    }
    
    public static void groupBy(String input){
        Map<String, List<String>> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity()));

        Stream<String> stream = Arrays.stream(input.split(""));


    }

    public static int nthsmallestnumber(int[][] arr,int n){
        int[] array = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream).toArray();
       return Arrays.stream(array).sorted().distinct().skip(n-1).findFirst().getAsInt();
    }

    public static int sumReduce(int[] arr){
       return Arrays.stream(arr).reduce(0,(e1,e2)->e1+e2);
    }

    //sort 0,1,2 in O(n)
    public static String  sortNumbers(int[] arr){
        int i=0;
        int j = arr.length-1;
        int k = 0;
        while(k< arr.length-1 && i<=j){
            if(arr[k]==0){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                i++;
            }
            if(arr[k]==2){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j--;
            }
            k++;
        }
        return Arrays.toString(arr);

    }
}
