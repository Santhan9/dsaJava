package com.santhan.dsa.problemsolving;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.santhan.dsa.problemsolving.ArraysProblems.*;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysProblemsTest {





    @Test
    public void removeEvenTest(){
        int[] arr = new int[]{3,2,4,7,10,6,5,9,6,11,3};
       int[] res = removeEvenIntegersFromArray(arr);
        Arrays.stream(res).forEach(System.out::println);
        assertFalse(Arrays.stream(res).anyMatch(e->e%2==0));
    }
    @Test
    public void reverseArrayTest(){
        int[] arr = new int[]{3,2,4,7,10,6,5,9,6,11,18};
        Arrays.stream(reverseArray(arr)).forEach(System.out::println);
    }

    @Test
    public void minArrayTest(){
        int[] arr = new int[]{3,2,4,7,10,6,5,9,6,11,18};
        assertEquals(2,minValue(arr));
    }

    @Test
    public void secondMaxArrayTest(){
        int[] arr = new int[]{3,2,4,7,10,6,5,9,6,11,18};
        assertEquals(11,secondMaxValue(arr));
    }

    @Test
    public void secondMinArrayTest(){
        int[] arr = new int[]{1,2,4,7,10,6,5,9,6,11,18};
        assertEquals(2,secondMinValue(arr));
    }

    @Test
    public void thirdMinArrayTest(){
        int[] arr = new int[]{1,2};
        assertEquals(2,thirdMinArray(arr));
    }

    @Test
    public void moveZerosToEndTest(){
        int[] arr = new int[]{1,0,4,7,0,6,5,9,6,11,18};
       int[] res = moveZerosToEnd(arr);
        Arrays.stream(res).forEach(System.out::println);
       assertEquals(0,res[arr.length-2]);


    }
    @Test
    public void missingNumberTest(){
        int[] arr = new int[]{1,3,4,5};
      assertEquals(2,missingNumber(arr));
    }

    @Test
    public void palindromeTest(){
       String s = "madam";
        assertTrue(ispalindrome(s));
    }
}
