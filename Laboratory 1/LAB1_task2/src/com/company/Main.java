package com.company;

public class Main {

    public static void main(String[] args) {
        University UTM = new University("UTM", 1965);
        University ASEM = new University("ASEM", 1950);
        University USM = new University("USM", 1955);
        Student Eliodor = new Student("Eliodor", 21, 10);
        Student Alexandru = new Student("Alexandru", 23, 9);
        Student Jora = new Student("Jora", 20, 8);
        Student Ion = new Student("Ion", 19, 5);
        Student Adrian = new Student("Adrian",22, 7);
        Student Vasile = new Student("Vasile", 21, 8);
        UTM.addStudent(Eliodor);
        UTM.addStudent(Alexandru);
        ASEM.addStudent(Jora);
        ASEM.addStudent(Ion);
        USM.addStudent(Adrian);
        USM.addStudent(Vasile);
        UTM.printStudents();
        System.out.println("Average mark for "+UTM.getName()+": "+UTM.getAverageMark());
        System.out.println("Average mark for "+ASEM.getName()+": "+ASEM.getAverageMark());
        System.out.println("Average mark for "+USM.getName()+": "+USM.getAverageMark());
        float sum = 0;
        sum = UTM.getAverageMark() + ASEM.getAverageMark() + USM.getAverageMark();
        System.out.println("Average mark for all universities: "+sum/3);


    }
}
