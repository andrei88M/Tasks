package org.example;

public class Student {
    StudentType studentType;

    public Student(StudentType studentType) {
        this.studentType = studentType;
    }

    public void printResult(){
        studentType.printResult();
    }

}
