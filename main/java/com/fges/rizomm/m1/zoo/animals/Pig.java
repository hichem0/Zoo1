package main.java.com.fges.rizomm.m1.zoo.animals;

public  class Pig extends Animal implements  Vertebrate{


    @Override
    public String toString() {
        return "PigTest : " + super.toString();
    }

    @Override
    public String Backbone()  {
        return "True";
    }


    public String scream() {
        return "goro-goro-goro";
    }

    @Override
    public void Weight() {
      System.out.println("75-100 Kg");
    }

    @Override
    public void Size() {
        System.out.println("Height: Wild boar: 55 – 120 cm, Palawan bearded pig: 100 cm\n" +
                           "Length: Wild boar: 90 – 200 cm");

    }
    public void throwIllegalArgumentException() {

    }
}



