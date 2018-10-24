package test.java.com.fges.rizomm.m1.zoo.animals;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DogTest {

    @Test
    void scream() {

        Animal dog =new Dog();
        assertTrue(dog.scream().matches(".*"));
        assertTrue(dog.scream().equals("Woof"));
        assertTrue(!dog.scream().isEmpty());
        assertTrue(dog.isInCage());
        assertTrue(!dog.isInVisitingArea());



    }
    @Test
    void  Backbone(){

        Animal dog =new Dog();

        assertTrue(dog.Backbone().equals("True"));
        assertTrue(!dog.Backbone().equals(""));
    }
    @Test
    void Weight(){
        Animal dog = new Dog();
        dog.Weight();


    }
    @Test()
    public void testForExceptions1() {
        Animal dog = new Dog();

        dog.throwIllegalArgumentException();
    }


}
