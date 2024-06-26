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
        if(head == null){
            return -1;
        }
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
        if(index > getLength()){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == getLength()){
            addAtTail(val);
            return;
        }
        Node curr = head;
        int i =0;
        while(i<index-1){
            curr= curr.next;
            i++;
        }

        Node temp = curr.next;
        curr.next = new Node(val,temp);



    }

    public int getLength(){
        if(head == null){
            return 0;
        }
        Node curr = head;
        int i=1;

        while(curr.next != null){
            curr = curr.next;
            i++;
        }
        return i;
    }

    public void deleteAtIndex(int index) {
        if(index < getLength()){
            if(index == 0){
                head = head.next;
                return;
            }
            int i =0;
            Node curr = head;
            while(i<index-1){
                curr = curr.next;
                i++;
            }
            Node del = curr.next;
            curr.next = del.next;
        }

    }


}
