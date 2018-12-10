package com.company;

public class Student{
    public String name;
    public int age;
    public float mark;

    public Student(String name, int age, float mark){
        this.name=name;
        this.age=age;
        this.mark=mark;
    }


    void printStudent(){
        System.out.println("Name: "+name+"\nN=Age: "+age+"\nGrade: "+mark);
    }

    public float getMark(){
        return mark;
    }


}
