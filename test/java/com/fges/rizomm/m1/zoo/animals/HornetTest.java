package test.java.com.fges.rizomm.m1.zoo.animals;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Hornet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HornetTest {
    @Test
    void scream() {

        Animal hornet =new Hornet();
        assertTrue(hornet.scream().matches(".*"));
        assertTrue(hornet.scream().equals("ZZZiiZZZ"));
        assertTrue(!hornet.scream().isEmpty());
        assertTrue(hornet.isInCage());
        assertTrue(!hornet.isInVisitingArea());



    }
    @Test
    void  Backbone(){

        Animal hornet =new Hornet();


        assertTrue(hornet.Backbone().equals("False"));
        assertTrue(!hornet.Backbone().equals(""));



    }
    @Test
    void Weight(){
        Animal hornet = new Hornet();
        hornet.Weight();


    }
    @Test()
    public void testForExceptions1() {
        Animal hornet = new Hornet();

        hornet.throwIllegalArgumentException();
    }


}


