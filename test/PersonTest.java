import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class PersonTest {

    @Test
    public void shouldReturnTomIfPersonNameIsTom() {
        String expectedName = "Tom";
        Person person = new Person("Tom", 23);
        assertEquals(expectedName, person.getName());
    }

    @Test
    public void shouldReturnTomIfPersonNameIsRam() {
        String expectedName = "Tom";
        Person person = new Person("Ram", 23);
        assertNotEquals(expectedName, person.getName());
    }

    @Test
    public void shouldReturn25IfAllergicScoreIs25() {
        Person person = new Person("Tom", 25);
        assertTrue(25 == person.getallergyScore());
    }

    @Test
    public void shouldNotReturn255IfAllergicScoreIs23() {
        Person person = new Person("Tom", 23);
        assertTrue(255 != person.getallergyScore());
    }
}