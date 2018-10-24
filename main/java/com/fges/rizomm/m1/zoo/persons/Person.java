package main.java.com.fges.rizomm.m1.zoo.persons;


import main.java.com.fges.rizomm.m1.zoo.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {

   /* private List<Animal> animals = new ArrayList<Animal>();

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }*/


    private String firstName;
    private String lastName;
    private State age;
    private boolean parent; //true if the child is acompagned by a parent

    public Person(){}

    public Person(State age)
    {
        if(age.equals(State.Adult))
        {
            this.parent = false;
        }
        else
        {
            this.parent = true;
        }
    }

    public State getAge() {
        return age;
    }


    public void setAge(State age) {
        this.age = age;
    }


    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }


    public void setFirstName(String FirstName) { this.firstName = FirstName; }
    public void setLastName(String LastName) { this.lastName = LastName; }




}


