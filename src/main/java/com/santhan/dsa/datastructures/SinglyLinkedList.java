package com.santhan.dsa.datastructures;

public class SinglyLinkedList {

    Node head;


    static class Node{
        int val;
        Node next;
        Node(int val, Node next){
            this.val = val ;
            this.next = next;
        }

    }

    public SinglyLinkedList() {

    }

    public int get(int index) {
        Node curr = head;
        int i =0;
        while(curr.next!=null && i<index){
            curr = curr.next;
            i++;
        }
       return i!=index ? -1 : curr.val;
    }

    public void addAtHead(int val) {

        if(head == null){
            head = new Node(val,null);
        }else{
            Node temp = head;
            head = new Node(val,temp);
        }

    }

    public void addAtTail(int val) {
        if(head == null){
            addAtHead(val);
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr= curr.next;
        }
        curr.next = new Node(val,null);
    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }
}
