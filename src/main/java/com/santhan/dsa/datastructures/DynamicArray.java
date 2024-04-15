package com.santhan.dsa.datastructures;

public class DynamicArray<T> {

    private T[] arr;
    private int capacity;

    private int index;

    /*
     * Initialize Dynamic Array with initial capacity
     * of 10. initial value of index is -1
     * */
    @SuppressWarnings("unchecked")
    public DynamicArray() {
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];
        this.index = -1;
    }

    /*
     * add method to add elements into the dynamic array,
     * check for the empty array space,
     * place the new value in index plus
     * */
    public void add(T t) {
        if (capacity - index <= 1) {
            increaseCapacity();
        }
        arr[++index] = t;
    }
    public int size() {
        return this.index + 1;
    }
    @SuppressWarnings("unchecked")
    public void increaseCapacity() {
        int newCapacity = capacity * 2;
        T[] newArry = (T[]) new Object[newCapacity];
        if (index + 1 >= 0) System.arraycopy(arr,0,newArry,0,index + 1);
        arr = newArry;
        this.capacity = newCapacity;
    }

    public void remove(int inx){
        for(int i = inx;i<index;i++){
            arr[i] = arr[i+1];
        }
        index--;
    }

    public T get(int inx){
        if(inx > index){
            throw new RuntimeException("requested index does not exist");
        }
        return arr[inx];
    }

    public void print(){
        for(int i = 0;i<size();i++){
            System.out.print(get(i)+ " ");
        }
    }
}
