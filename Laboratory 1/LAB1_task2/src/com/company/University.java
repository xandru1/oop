package com.company;

public class University {
    private String name;
    private int foundationYear;
    public Student[] students;
    public int numberOfStudents = 0;

    public University(String name, int foundationYear){
        this.name = name;
        this.foundationYear = foundationYear;
        students = new Student[10];
    }

    public String getName(){
        return name;
    }
    public void addStudent(Student student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void printStudents(){
        System.out.println(name + " students:");
        for(int i=0; i<numberOfStudents; i++){
            students[i].printStudent();
        }
    }
    public float getAverageMark(){
        float sum=0;
        for(int i=0; i<numberOfStudents; i++){
            sum+=students[i].getMark();
        }

        return sum/numberOfStudents;
    }
}
