package com.santhan.dsa.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    DoublyLinkedList list;

    @Test
    void addAtHeadTest() {
        list = new DoublyLinkedList();
        list.addAtHead(10);
        assertEquals(10,list.get(0));

    }

    @Test
    void addAtHeadMultipleTest1() {
        list = new DoublyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtHead(12);
        assertEquals(12,list.get(0));

    }

    @Test
    void addAtHeadMultipleTest2() {
        list = new DoublyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtHead(12);
        assertEquals(11,list.get(1));

    }

    @Test
    void addAtHeadMultipleTest3() {
        list = new DoublyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtHead(12);
        assertEquals(10,list.get(2));

    }

    @Test
    void addAtTailTest() {
        list = new DoublyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtTail(15);
        assertEquals(15,list.get(2));

    }

    @Test
    void getTest1() {
        list = new DoublyLinkedList();
        list.addAtTail(10);
        assertEquals(10,list.get(0));
    }

    @Test
    void getTest2() {
        list = new DoublyLinkedList();

        assertEquals(-1,list.get(0));
    }

    @Test
    void getTest3() {
        list = new DoublyLinkedList();
        list.addAtTail(15);
        list.addAtTail(1);
        assertEquals(1,list.get(1));
    }

    @Test
    void addAtIndexTest(){
        list = new DoublyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtHead(11);
        list.addAtHead(11);
        list.addAtHead(11);
        list.addAtTail(15);
        list.addAtIndex(4,13);
        assertEquals(13,list.get(4));

    }

    @Test
    void getLengthTest(){
        list = new DoublyLinkedList();
        list.addAtHead(10);
        list.addAtHead(11);
        list.addAtHead(11);
        list.addAtHead(11);
        list.addAtHead(11);
        list.addAtTail(15);
        assertEquals(6,list.getLength());
    }

    @Test
    void deleteAtIndexTest1(){
        list = new DoublyLinkedList();
        list.addAtTail(15);
        list.deleteAtIndex(0);
        assertEquals(-1,list.get(1));

    }

    @Test
    void deleteAtIndexTest2(){
        list = new DoublyLinkedList();
        list.addAtTail(15);
        list.addAtTail(14);
        list.deleteAtIndex(0);
        assertEquals(14,list.get(0));


    }

    @Test
    void deleteAtIndexTest3(){
        list = new DoublyLinkedList();
        list.addAtTail(15);
        list.addAtTail(14);
        list.deleteAtIndex(1);
        assertEquals(-1,list.get(1));

    }

    @Test
    void deleteAtIndexTest4(){
        list = new DoublyLinkedList();
        list.addAtTail(15);
        list.addAtTail(14);
        list.addAtTail(13);
        list.deleteAtIndex(1);
        assertEquals(13,list.get(1));

    }

//    ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get","get","deleteAtIndex","deleteAtIndex","get","deleteAtIndex","get"]
//            [[],[1],[3],[1,2],[1],[1],[1],[3],[3],[0],[0],[0],[0]]


    @Test
    void linkedListE2ETest(){
        list = new DoublyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1,2);
        assertEquals(2,list.get(1));
        list.deleteAtIndex(1);
        assertEquals(3,list.get(1));
        assertEquals(-1,list.get(3));
        list.deleteAtIndex(3);
        list.deleteAtIndex(0);
        assertEquals(3,list.get(0));
        list.deleteAtIndex(0);
        assertEquals(-1,list.get(0));


    }
}