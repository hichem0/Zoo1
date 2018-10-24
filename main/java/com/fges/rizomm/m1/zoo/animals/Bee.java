package main.java.com.fges.rizomm.m1.zoo.animals;

public class Bee extends Animal implements Invertebrate {
    @Override
    public String toString() {
        return "Bee : " + super.toString();
    }
    @Override

    public String scream() {
        return "ZZZZ";
    }

    @Override
    public String Backbone()  {
        return "False";
    }



    @Override
    public void Weight() {
        System.out.println("0,0025 kg");
    }

    @Override
    public void Size() {
        System.out.println("39 millimetres");
    }

    @Override
    public void throwIllegalArgumentException() {

    }
}


