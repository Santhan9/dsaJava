package com.santhan.dsa.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DynamicArrayTest {

    DynamicArray<Integer> array;
    @BeforeEach
    public void setup(){
        array = new DynamicArray<Integer>();

    }

    @Test
    public void sizeTest() {
        int val = array.size();
        assertEquals(0,val);
    }

    @Test
    public void addTest(){
        for(int i=0;i<30;i++){
            array.add(i);
        }
        int val = array.size();
        assertEquals(30,val);
    }

    @Test
    public void remove(){
        for(int i=0;i<30;i++){
            array.add(i);
        }
        array.remove(5);
        int val = array.size();
        assertEquals(29,val);

    }

    @Test
    public void getTest(){
        for(int i=0;i<30;i++){
            array.add(i);
        }
       int val = array.get(15);
        assertEquals(15,val);
    }

    @Test
    public void printTest(){
        for(int i=0;i<30;i++){
            array.add(i);
        }
        array.print();
    }
}