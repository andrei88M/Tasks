package org.example;

public class ThreeType extends Type{

    public ThreeType(double talent, double time) {
        super(talent, time,3);
    }

    @Override
    public void printResult() {
        double studyTime = getTime();
        System.out.println("тип студента №" + getType()
                + "\nталант студента = " + getTalent()
                + "\nвремя на практику " + studyTime / 1.0);
    }
}
