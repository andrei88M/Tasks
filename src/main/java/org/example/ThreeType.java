package org.example;

public class ThreeType extends Type{

    public ThreeType(double talent, double time) {
        super(talent, time,3);
    }

    @Override
    public void printResult() {
        double studyTime = getTime();
        System.out.println("Type of student №" + getType()
                + "\ntalent Student = " + getTalent()
                + "\nTime to practice " + studyTime / 1.0);
    }
}
