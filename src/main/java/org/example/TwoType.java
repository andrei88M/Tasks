package org.example;

public class TwoType extends Type {

    public TwoType(double talent, double time) {
        super(talent, time,2);
    }

    @Override
    public void printResult() {
        double studyTime = getTime();
        System.out.println("тип студента №" + getType()
                + "\nталант студента = " + getTalent()
                + "\nвремя на разбор " + studyTime / 2.0
                + "\nвремя на практику " + studyTime / 2.0);
    }
}
