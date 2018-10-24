package main.java.com.fges.rizomm.m1.zoo.animals;

public class Hornet extends Animal implements Invertebrate{

    @Override
    public String toString() {
        return "HornetTest : " + super.toString();
    }
    @Override
    public String Backbone()  {
        return "False";
    }

    public String scream() {
        return "ZZZiiZZZ";
    }

    @Override
    public void Weight() {
        System.out.println("1g");
    }

    @Override
    public void Size() {
        System.out.println("5.5 cm (2.2 inches)");
    }
    public void throwIllegalArgumentException() {

    }
}


