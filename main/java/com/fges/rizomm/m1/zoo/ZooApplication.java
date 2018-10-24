package main.java.com.fges.rizomm.m1.zoo;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Cat;
import main.java.com.fges.rizomm.m1.zoo.animals.Dog;
import main.java.com.fges.rizomm.m1.zoo.animals.Bee;
import main.java.com.fges.rizomm.m1.zoo.persons.*;
import main.java.com.fges.rizomm.m1.zoo.animals.Reproduction;


public class ZooApplication {

    private static final String ZOO_NAME = "PARIDAIZA";

    public static void main(String[] args) {

        System.out.println("************************");
        System.out.println("Welcome to " + ZOO_NAME);
        System.out.println("************************");

        Dog rex = new Dog();
        Dog gaia = new Dog();

        Cat felix = new Cat();
        felix.setName("Felix");

        Bee bee = new Bee();
        bee.setName("maya");

        rex.setName("Rex");
        gaia.setName("Gaia");

        Person toto = new Cleaner();
        toto.setAge(State.Adult);
        System.out.println(toto.getAge());


      /*  toto.addAnimal(gaia);
        toto.addAnimal(felix);

        System.out.println("Animals of toto");
        for (int i = 0; i < toto.getAnimals().size(); i++) {
            Animal animal = toto.getAnimals().get(i);
            switch (animal.getClass().getSimpleName()) {
                case "Dog":
                    System.out.println("Dog");
                    break;
                case "Cat":
                    System.out.println("Cat");
                    break;
            }

        }*/

        AnimalKeeper keeper = new
                Keeperinvertebrate();
        Animal dog = new Dog();
        dog.setName("Cyrus");
        //dog.setInCage(false);

        Cleaner c1 = new Cleaner();
        System.out.println(c1.cleanCage(dog));
        System.out.println(dog.getEatCount());
        keeper.feed(dog, "steak");
        System.out.println(dog.getEatCount());
        String str = "Dog";
        String str2= "Raven";
        Reproduction reproduction = Enum.valueOf(Reproduction.class, str);
        Reproduction reproduction2 = Enum.valueOf(Reproduction.class, str2);
        System.out.println( reproduction+" type Animal: " + reproduction.prod() +"\n"+ reproduction2+ " type Animal: "+  reproduction2.prod());




    }

}
