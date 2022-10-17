package lengthylearner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(259L, "Jordy");
        String actualName = person.getName();
        Long actualId = person.getId();
        Assertions.assertSame("Jordy", actualName);
        Assertions.assertEquals(259L, actualId);
    }

    @Test
    public void testSetName(){
        Person person = new Person(784L, "");
        String expected = "Dave";
        person.setName(expected);
        String actual = person.getName();
        Assertions.assertEquals(expected, actual);
    }

}