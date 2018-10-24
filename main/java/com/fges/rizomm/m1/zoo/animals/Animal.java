package main.java.com.fges.rizomm.m1.zoo.animals;

public abstract class Animal {

    private String name;

    private int eatCount;
    private String healthstate;
    private boolean inCage;
    private boolean inVisitingArea;

    public Animal() {
        inCage = true;
        inVisitingArea = false;
        healthstate ="in shape";

    }

    public String getHealthstate() {
        return healthstate;
    }

    public void setHealthstate(String healthstate) {
        this.healthstate = healthstate;
    }

    public boolean isInVisitingArea() {
        return inVisitingArea;
    }

    public void setInVisitingArea(boolean inVisitingArea) {
        this.inVisitingArea = inVisitingArea;
    }

    public boolean isInCage() {
        return inCage;
    }

    public void setInCage(boolean inCage) {
        this.inCage = inCage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public abstract String scream();
    public abstract String Backbone() ;
    public abstract void Weight() ;
    public abstract void Size() ;

    public void eat(String food) {
        this.eatCount++;
    }

    public int getEatCount() {
        return eatCount;
    }

    public void setEatCount(int eatCount) {
        this.eatCount = eatCount;
    }


    public abstract void throwIllegalArgumentException();
}
