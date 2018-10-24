package test.java.com.fges.rizomm.m1.zoo.animals;
import main.java.com.fges.rizomm.m1.zoo.animals.Animal;

import main.java.com.fges.rizomm.m1.zoo.animals.Lion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LionTest {


    @Test
    void scream() {

        Animal lion =new Lion();
        assertTrue(lion.scream().matches(".*"));
        assertTrue(lion.scream().equals("waaaaaa"));
        assertTrue(!lion.scream().isEmpty());
        assertTrue(lion.isInCage());
        assertTrue(!lion.isInVisitingArea());



    }
    @Test
    void  Backbone(){

        Animal lion =new  Lion();


        assertTrue(lion.Backbone().equals("True"));
        assertTrue(!lion.Backbone().equals(""));




    }
    @Test
    void Weight(){
        Animal lion = new Lion();
        lion.Weight();


    }
    @Test()
    public void testForExceptions1() {
        Animal lion = new Lion();

        lion.throwIllegalArgumentException();
    }


}