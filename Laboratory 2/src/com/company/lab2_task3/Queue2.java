package com.company.lab2_task3;

public class Queue2 {
    private int maxElements = 100;
    private int state = 0;
    private int[] array1;

    private Queue2(){
        this.array1 = new int[100];
    }

    public Queue2( int maxElements){
        array1 = new int[maxElements];
        this.maxElements = maxElements;
    }

    public void addElement(int element){
        state++;
        if (maxElements < state){
            int[] array2 = new int[maxElements*2];
            for (int i=0; i<maxElements; i++){
                array2[i]=array1[i];
            }
            maxElements*=2;
            array1 = array2;
            System.out.println("Max number increased");
        }
        array1[state-1] = element;
    }

    public int getElement(){
        int temp;
        if (state == 0) {
            System.out.println("Queue is empty!");
            return 0;
        }
        state--;
        temp = array1[state];
        return temp;
    }

    public boolean isEmpty(){
        if (state == 0) return true;
        return false;
    }

    public boolean isFull(){
        if (state == maxElements) return true;
        return false;
    }
}
