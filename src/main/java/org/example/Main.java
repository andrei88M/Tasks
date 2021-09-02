package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            students.add(new Student(new OneType(Generate.randomValue(),198)));
            students.add(new Student(new TwoType(Generate.randomValue(),198)));
            students.add(new Student(new ThreeType(Generate.randomValue(),198)));
        }
        students.forEach(Student::printResult);
    }

}
