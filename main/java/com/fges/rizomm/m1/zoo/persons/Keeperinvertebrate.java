package main.java.com.fges.rizomm.m1.zoo.persons;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Invertebrate;


public class Keeperinvertebrate extends AnimalKeeper {


    public Keeperinvertebrate(State age) {
        super(age);
    }

    public Keeperinvertebrate() {

    }

    public void feed(Animal animal, String food){
    if(food!=null && animal instanceof Invertebrate){
        animal.eat(food);



    }


}

}
