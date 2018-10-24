package main.java.com.fges.rizomm.m1.zoo.animals;

public class Horse extends Animal implements Vertebrate {
    @Override
    public String toString() {
        return "HorseTest : " + super.toString();
    }
    @Override
    public String Backbone()  {
        return "True";
    }

    public String scream() {
        return "Neigh";

    }


    @Override
    public void Weight() {
        System.out.println("380 – 1,000 kg");
    }

    @Override
    public void Size() {
        System.out.println("Height: 1.4 – 1.8 m \n" +
                           "Length: 2.4 m (Adult)");
    }
    public void throwIllegalArgumentException() {

    }
}
