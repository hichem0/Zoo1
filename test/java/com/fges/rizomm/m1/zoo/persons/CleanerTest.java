package test.java.com.fges.rizomm.m1.zoo.persons;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Bee;
import main.java.com.fges.rizomm.m1.zoo.persons.Cleaner;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CleanerTest {
    @Test
     public void cleanertest(){
         Animal bee = new Bee();
    Cleaner cleaner= new Cleaner();
    assertTrue(cleaner.cleanCage(bee).equals("Cant clean : "+ bee.getName()+" is in cage"));}
}
