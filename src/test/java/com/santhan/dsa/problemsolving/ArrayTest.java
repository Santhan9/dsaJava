package com.santhan.dsa.problemsolving;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.santhan.dsa.problemsolving.ArraysProblems.*;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {





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
}
