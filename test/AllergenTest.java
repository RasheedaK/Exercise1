import org.junit.Test;

import static org.junit.Assert.*;

public class AllergenTest {
    @Test
    public void shouldReturnTrueIfExpectedStringIsSameAsActual() {
        Allergen allergen = new Allergen("Egg", 1);
        String expected = "Egg(1)";
        assertEquals(expected, allergen.toString());
    }

    @Test
    public void shouldReturnFalseIfExpectedStringIsNotSameAsActual() {
        Allergen allergen = new Allergen("Egg", 1);
        String expected = "Egg/1/";
        assertNotEquals(expected, allergen.toString());
    }
}