package com.santhan.dsa.problemsolving;

import java.util.List;
import java.util.stream.Collectors;

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
}
