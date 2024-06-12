package com.santhan.dsa.problemsolving;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<Integer> li;
    int index = -1;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        li = new ArrayList();

    }

    public void push(int val) {
        if(val<min){
            min = val;
        }
        li.add(val);
        index++;

    }

    public void pop() {
        li.remove(index);

    }

    public int top() {
       return li.get(index);

    }

    public int getMin() {
        return min;

    }
}

