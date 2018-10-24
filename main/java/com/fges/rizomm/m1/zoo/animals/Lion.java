package main.java.com.fges.rizomm.m1.zoo.animals;

public  class Lion extends Animal implements  Vertebrate {
    @Override
    public String toString() {
        return "Lion : " + super.toString();
    }
    @Override
    public String Backbone()  {
        return "True";
    }

    public String scream() {
        return "waaaaaa";
    }

    @Override
    public void Weight() {
        System.out.println("190 Kg");
    }

    @Override
    public void Size() {
        System.out.println("Height: Male: 1.2 m (Adult, At Shoulder)\n" +
                           "Length: Male: 1.7 – 2.5 m (Head and body)");
    }
    public void throwIllegalArgumentException() {

    }
}



