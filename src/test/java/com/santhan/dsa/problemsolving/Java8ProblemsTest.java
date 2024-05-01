package com.santhan.dsa.problemsolving;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Java8ProblemsTest {

    @Test
    void sumListOfEvenIntegers() {
        List<Integer> li = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(30, Java8Problems.evenSum(li));
    }

    @Test
    void longStringTest(){
        List<String> li = List.of("apple", "banana", "orange", "grapefruit", "kiwi", "strawberry");
        assertEquals("grapefruit",Java8Problems.longestString(li));
    }

    @Test
    void squaresTest(){
        List<Integer> li = List.of(1,2,3);
        assertEquals(9,Java8Problems.squares(li).get(2));
    }

    @Test
    void filterATest(){
        List<String> li = List.of("Apple", "Banana", "apricot", "Avocado", "kiwi", "strawberry");
        assertEquals(3,Java8Problems.filterwithA(li).size());
    }

    @Test
    void countOfDistintEvenNumbersTest(){
        List<Integer> li = List.of(1,2,2,3,4);
        assertEquals(6,Java8Problems.countOfDistintEvenNumbers(li));
    }
}