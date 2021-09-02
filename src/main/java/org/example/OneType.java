package org.example;

public class OneType extends Type {

    public OneType(double talent, double time) {
        super(talent, time,1);
    }

    @Override
    public void printResult() {
        double studyTime = getTime();
        System.out.println("тип студента №" + getType()
                + "\nталант студента = " + getTalent()
                + "\nвремя на разбор " + studyTime / 3.0
                + "\nвремя на практику " + studyTime / 3.0
                + "\nвремя на нахождение в потоке " + studyTime / 3.0);
    }
}
