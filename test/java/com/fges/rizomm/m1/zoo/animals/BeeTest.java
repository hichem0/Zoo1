package test.java.com.fges.rizomm.m1.zoo.animals;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Bee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BeeTest {

    @Test
    void scream() {

        Animal bee =new Bee();
        assertTrue(bee.scream().matches(".*"));
        assertTrue(bee.scream().equals("ZZZZ"));
        assertTrue(!bee.scream().isEmpty());
        assertTrue(bee.isInCage());
        assertTrue(!bee.isInVisitingArea());



    }
    @Test
    void  Backbone(){

        Animal bee =new  Bee();
        assertTrue(bee.Backbone().equals("False"));
        assertTrue(!bee.Backbone().equals(""));





    }
    @Test
    void Weight(){
        Animal bee = new Bee();
        bee.Weight();


    }
    @Test()
    public void testForExceptions1() {
        Animal bee = new Bee();

        bee.throwIllegalArgumentException();
    }


}