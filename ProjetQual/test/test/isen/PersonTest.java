package test.isen;

import isen.library.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        //fail("Not yet implemented");
    }

    @Test
    void getYears() {
        //fail("Not yet implemented");
    }

    @Test
    void setName() {
    }

    @Test
    void setYears() {
        //fail("Not yet implemented");
    }


    void TestPerson()
    { // EXERCICE 3 :
        Person p = new Person();
        assertEquals("unknow",p.getName());
        assertEquals(22,p.getYears());
        p.setName("Blabla"); p.setYears(23);
        assertEquals("Blabla",p.getName());
        assertEquals(23,p.getYears());
    } // Les test se réalise correctement
}
/*
EXERCICE 2 :
Projet réaliser sur IntelliJ, "fail("Not yet implemented");" n'y est donc pas présent d'origine.
L'execution se fait donc correctement, rien est présent dans les fonctions de test cependant elle
se lance bien comme prévu.
*/