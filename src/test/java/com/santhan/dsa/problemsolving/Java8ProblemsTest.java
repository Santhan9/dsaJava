package com.santhan.dsa.problemsolving;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

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

    @Test
    void countOccurancesTest(){
        System.out.println(Java8Problems.countoccurances("santhan"));
    }

    @Test
    void findDuplicatesTest(){
        System.out.println(Java8Problems.findDuplicates("santhan"));
    }

    @Test
    void firstNonRepeatElementTest(){
        System.out.println(Java8Problems.firstNonRepeatElement("asanthan"));
    }

    @Test
    void nthsmallestnumberTest(){
        int[][] input = new int[][]{{1,9},{4,2}};
        System.out.println(Java8Problems.nthsmallestnumber(input,3));
    }

    @Test
    void sumReduceTest(){
        System.out.println(Java8Problems.sumReduce(new int[]{1,2,3}));
    }


    @Test
    void groupAnagaramTest(){
        System.out.println(groupAnagrams(List.of("Hello","ate","tea","two","wto","true")));
        List<String> li = new ArrayList<>();
        li.add("two");
        li.add("aaa");
        li.add("abc");
        System.out.println(sortArray(li));

    }

    @Test
    void sort012(){
        int[] in = {2,1,0,1,1,1};
        String s = Java8Problems.sortNumbers(in);
        System.out.println(s);
    }

    public static List<List<String>> groupAnagrams(List<String> li){

        Map<String,List<String>> anagramMap = new HashMap<>();
        for(String s : li){
            char[] sc = s.toCharArray();
            Arrays.sort(sc);
            String sortedString = new String(sc);
            List<String> value = anagramMap.getOrDefault(sortedString,new ArrayList<>());
            value.add(s);
            anagramMap.put(sortedString,value);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public static  List<String> sortArray(List<String> li){
        return  li.stream().sorted().collect(Collectors.toList());
    }
}