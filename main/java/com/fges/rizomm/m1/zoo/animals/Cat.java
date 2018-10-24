package main.java.com.fges.rizomm.m1.zoo.animals;

public  class Cat  extends Animal implements Vertebrate{

    @Override
    public String toString() {
        return "Cat : " + super.getName();
    }

    @Override
    public String scream() {
        return "Miaou";
    }


    @Override
    public String Backbone()  {
        return "True";
    }
    @Override
    public void Weight() {
        System.out.println("3.6 – 4.5 kg");
    }

    @Override
    public void Size() {
        System.out.println("23 – 25 cm");
    }
    public void throwIllegalArgumentException() {

    }
}
