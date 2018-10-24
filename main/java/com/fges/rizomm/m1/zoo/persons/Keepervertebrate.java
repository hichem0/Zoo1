package main.java.com.fges.rizomm.m1.zoo.persons;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Vertebrate;

public class Keepervertebrate extends AnimalKeeper {

    public Keepervertebrate(State age) {
        super(age);
    }

    public Keepervertebrate() {
        super();
    }

    public void feed(Animal animal, String food){
        if(food!=null && animal instanceof Vertebrate){
            animal.eat(food);



        }


    }

}


