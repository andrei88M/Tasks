package org.example;

public abstract class Type implements StudentType {
    private final int type;
    private final double talent;
    private final double time;

    public Type(double talent, double time, int type) {
        this.talent = talent;
        this.time = time;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public double getTalent() {
        return talent;
    }

    double getTime() {
        return type * time / talent;
    }

}
