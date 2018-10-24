package main.java.com.fges.rizomm.m1.zoo.animals;
public  class Raven extends Animal implements Vertebrate{

    @Override
    public String toString() {
        return "RavenTest : " + super.getName();
    }
    @Override
    public String Backbone()  {
        return "True";
    }

    @Override
    public String scream() {
        return "aaaoaoa";
    }



    @Override
    public void Weight() {
        System.out.println("0.69 – 2 kg ");
    }

    @Override
    public void Size() {
        System.out.println("56 – 78 cm");
    }
    public void throwIllegalArgumentException() {

    }
}
