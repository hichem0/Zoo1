package test.java.com.fges.rizomm.m1.zoo.animals;

import com.sun.source.tree.AssertTree;
import main.java.com.fges.rizomm.m1.zoo.animals.Animal;

import main.java.com.fges.rizomm.m1.zoo.animals.Cat;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CatTest {
    @Test
    void scream() {

        Animal cat =new Cat();
        assertTrue(cat.scream().matches(".*"));
        assertTrue(cat.scream().equals("Miaou"));
        assertTrue(!cat.scream().isEmpty());
        assertTrue(cat.isInCage());
        assertTrue(!cat.isInVisitingArea());



    }
    @Test
    void  Backbone(){

        Animal cat =new Cat();



        assertTrue(cat.Backbone().equals("True"));
        assertTrue(!cat.Backbone().equals(""));

    }
    @Test
    void Weight(){
        Animal cat = new Cat();
        cat.Weight();


    }
    @Test()
    public void testForExceptions1() {
        Animal cat = new Cat();

        cat.throwIllegalArgumentException();
    }


}
