package test.java.com.fges.rizomm.m1.zoo.animals;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Dog;
import main.java.com.fges.rizomm.m1.zoo.animals.Bee;
import main.java.com.fges.rizomm.m1.zoo.persons.Cleaner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalTest {

    @Test
    void when_animal_scream_then_string() {
        Animal dog = new Dog();

        assertTrue(dog.scream().matches(".*"));
        assertTrue(dog.scream().equals("Woof"));
        assertTrue(!dog.scream().isEmpty());

        Animal bee = new Bee();

        assertTrue(bee.scream().matches(".*"));
        assertTrue(bee.scream().equals("ZZZZ"));
        assertTrue(!bee.scream().isEmpty());


    }



}
