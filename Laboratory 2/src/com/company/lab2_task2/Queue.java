package com.company.lab2_task2;

import java.util.ArrayList;
import java.util.List;

public class Queue{
    private List<Integer> list1 = new ArrayList<>();
    private int maxElements = 0;
    private int state = 0;
    public Queue(int maxElements){
        this.maxElements = maxElements;
    }

    public void addElement(int element){
        state++;
        if (maxElements !=0)
            if (maxElements < state){
                state--;
                System.out.println("Max number reached");
                return;
            }
        list1.add(element);
    }

    public int getElement(){
        int temp;
        if (state == 0) {
            System.out.println("Queue is empty!");
            return 0;
        }
        state--;
        temp = list1.get(state);
        list1.remove(state);
        return temp;
    }

    public boolean isEmpty(){
        if (state == 0) return true;
        else return false;
    }

    public boolean isFull(){
        if (maxElements == 0) {
            System.out.println("Max was not set");
            return false;
        }
        if (state == maxElements) return true;
        else return false;
    }
}