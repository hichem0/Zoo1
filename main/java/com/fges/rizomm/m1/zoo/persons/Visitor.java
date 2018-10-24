package main.java.com.fges.rizomm.m1.zoo.persons;

public class Visitor extends Person {


    public Visitor(State age) {
        super(age);
    }

    public void accesZoo(Person identity, String acces){

        if(identity.getAge().equals(1))   {
            System.out.println("Access Granted");}
            else {


            System.out.println("Access Denied");
            }

        }






}

