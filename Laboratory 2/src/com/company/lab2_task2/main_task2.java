package com.company.lab2_task2;

import java.util.Scanner;

public class main_task2 {

    public static void main(String[] args) {
        int y=0;
        int temp;
        boolean isRunning= true;

        System.out.println("Insert max elements: ");
        Scanner s2 = new Scanner(System.in);
        Queue q1 = new Queue(s2.nextInt());

        while (isRunning){
            System.out.println("1.add element\n2.get element\n3.isEmpty\n4.isFull\n0.exit");
            Scanner s1 = new Scanner(System.in);
            y = s1.nextInt();
            switch (y){
                case 1: {
                    System.out.println("Write new element: ");
                    Scanner sc = new Scanner(System.in);
                    q1.addElement(sc.nextInt());
                    break;
                }
                case 2:{
                    System.out.println("Last element: "+q1.getElement());
                    break;
                }
                case 3:{
                    if (q1.isEmpty()) System.out.println("Queue is Empty");
                    else System.out.println("Queue is not Empty");
                    break;
                }
                case 4:{
                    if (q1.isFull()) System.out.println("Queue is FULL");
                    else System.out.println("Queue is not FULL");
                    break;
                }
                case 0:{
                    isRunning=false;
                    break;
                }
            }
        }
    }
}
