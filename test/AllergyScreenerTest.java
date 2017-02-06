import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AllergyScreenerTest {
    @Test
    public void shouldReturnEggsAsAllergenForAllergicScore24O() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        String expected = "eggs(1)";
        assertEquals(expected, allergyScreener.isAllergicTo(256));
    }

    @Test
    public void shouldNotReturnEggsAsAllergenIfAllergicScore25() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        String expected = "eggs(1)";
        assertNotEquals(expected, allergyScreener.isAllergicTo(25));
    }


    private List<Allergen> getAllergens() {
        List<Allergen> allergens = new ArrayList<>();
        allergens.add(new Allergen("eggs", 1));
        allergens.add(new Allergen("Chocolate", 3));
        return allergens;
    }
}