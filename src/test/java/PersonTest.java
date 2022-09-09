import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before(){
        person = new Person("Ethan");
    }

    @Test
    public void hasName(){
        assertEquals("Ethan", person.getName());
    }

}
