package test.java.com.fges.rizomm.m1.zoo.animals;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;

import main.java.com.fges.rizomm.m1.zoo.animals.Raven;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RavenTest {
    @Test
    void scream() {

        Animal raven =new Raven();
        assertTrue(raven.scream().matches(".*"));
        assertTrue(raven.scream().equals("aaaoaoa"));
        assertTrue(!raven.scream().isEmpty());
        assertTrue(raven.isInCage());
        assertTrue(!raven.isInVisitingArea());



    }
    @Test
    void  Backbone(){

        Animal raven =new Raven();


        assertTrue(raven.Backbone().equals("True"));
        assertTrue(!raven.Backbone().equals(""));





    }
    @Test
    void Weight(){
        Animal raven = new Raven();
        raven.Weight();


    }
    @Test()
    public void testForExceptions1() {
        Animal raven = new Raven();

        raven.throwIllegalArgumentException();
    }


}