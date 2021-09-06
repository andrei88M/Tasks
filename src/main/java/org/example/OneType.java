package org.example;

public class OneType extends Type {

    public OneType(double talent, double time) {
        super(talent, time,1);
    }

    @Override
    public void printResult() {
        double studyTime = getTime();
        System.out.println("Type of student №" + getType()
                + "\nTalent Student = " + getTalent()
                + "\ntime on the analysis " + studyTime / 3.0
                + "\nTime to practice " + studyTime / 3.0
                + "\nTime to stay in the stream " + studyTime / 3.0);
    }
}
