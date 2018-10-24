package test.java.com.fges.rizomm.m1.zoo.animals;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Pig;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PigTest {
    @Test
    void scream() {

        Animal pig = new Pig();
        assertTrue(pig.scream().matches(".*"));
        assertTrue(pig.scream().equals("goro-goro-goro"));
        assertTrue(!pig.scream().isEmpty());
        assertTrue(pig.isInCage());
        assertTrue(!pig.isInVisitingArea());


    }

    @Test
    void Backbone(){

    Animal pig = new Pig();

        assertTrue(pig.Backbone().equals("True"));
        assertTrue(!pig.Backbone().equals(""));


}


    @Test
    void Weight(){
        Animal pig = new Pig();
        pig.Weight();


    }
    @Test()
    public void testForExceptions1() {
        Animal pig = new Pig();

        pig.throwIllegalArgumentException();
    }


}