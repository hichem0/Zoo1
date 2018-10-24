package main.java.com.fges.rizomm.m1.zoo.persons;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;

public class Cleaner extends Employee {




    public String cleanCage(Animal animal) {

        if (animal.isInCage())  {
            return ("Cant clean : "+ animal.getName()+" is in cage");

        } else {
            return ("Cleaning cage ... ");

        }

    }


    public String cleanVisitArea(Animal animal)
    {
        if (animal.isInVisitingArea())  {
            return ("Cant clean : "+ animal.getName()+" is in visiting area");

        } else {
            return ("Cleaning visiting area ... ");

        }

    }
}
