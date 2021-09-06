package org.example;

public class TwoType extends Type {

    public TwoType(double talent, double time) {
        super(talent, time,2);
    }

    @Override
    public void printResult() {
        double studyTime = getTime();
        System.out.println("Type of student №" + getType()
                + "\ntalent Student = " + getTalent()
                + "\ntime on the analysis " + studyTime / 2.0
                + "\nTime to practice " + studyTime / 2.0);
    }
}
