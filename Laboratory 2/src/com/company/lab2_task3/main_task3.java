package com.company.lab2_task3;

public class main_task3 {
    public static void main(String[] args) {
        Queue2 q2=new Queue2();
        for(int i = 0; i<100; i++){
            q2.addElement(i);
        }
        System.out.println(q2.isFull());
        q2.addElement(100);
        System.out.println(q2.isFull());
    }
}
