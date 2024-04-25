package com.santhan.dsa.datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SinglyLinkedListTest {

    SinglyLinkedList list ;

    @Test
    void addAtHeadTest() {
        list = new SinglyLinkedList();
        list.addAtHead(10);
        Assertions.assertEquals(10,list.get(0));

    }

    @Test
    void addAtHeadMultipleTest1() {
        list = new SinglyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtHead(12);
        Assertions.assertEquals(12,list.get(0));

    }

    @Test
    void addAtHeadMultipleTest2() {
        list = new SinglyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtHead(12);
        Assertions.assertEquals(11,list.get(1));

    }

    @Test
    void addAtHeadMultipleTest3() {
        list = new SinglyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtHead(12);
        Assertions.assertEquals(10,list.get(2));

    }

    @Test
    void addAtTailTest() {
        list = new SinglyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtTail(15);
        Assertions.assertEquals(15,list.get(2));

    }

    @Test
    void addAtIndexTest(){

    }


}