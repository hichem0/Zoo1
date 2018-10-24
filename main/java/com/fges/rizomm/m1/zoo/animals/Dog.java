package main.java.com.fges.rizomm.m1.zoo.animals;

public  class Dog extends Animal implements Vertebrate {

    @Override
    public String toString() {
        return "Dog : " + super.toString();
    }


    public String scream() {
        return "Woof";
    }

    @Override
    public String Backbone()  {
        return "True";
    }

    @Override
    public void Weight() {
        System.out.println("7-27 kg");
    }

    @Override
    public void Size() {
        System.out.println("15 – 110 cm");
    }
    public void throwIllegalArgumentException() {

    }
}


