package test.java.com.fges.rizomm.m1.zoo.animals;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Horse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HorseTest {
    @Test
    void scream() {

        Animal horse =new Horse();
        assertTrue(horse.scream().matches(".*"));
        assertTrue(horse.scream().equals("Neigh"));
        assertTrue(!horse.scream().isEmpty());
        assertTrue(horse.isInCage());
        assertTrue(!horse.isInVisitingArea());



    }
    @Test
    void  Backbone(){

        Animal horse =new Horse();


        assertTrue(horse.Backbone().equals("True"));
        assertTrue(!horse.Backbone().equals(""));




    }
    @Test
    void Weight(){
        Animal horse = new Horse();
        horse.Weight();


    }
    @Test()
    public void testForExceptions1() {
        Animal horse = new Horse();

        horse.throwIllegalArgumentException();
    }


}