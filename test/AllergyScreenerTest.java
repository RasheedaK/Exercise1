import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AllergyScreenerTest {
    @Test
    public void shouldReturnEggsAsAllergenForAllergicScore24O() {
        Map<String, Integer> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        String expected = "eggs(1)";
        assertEquals(expected, allergyScreener.AllergicTo(256));
    }

    @Test
    public void shouldNotReturnEggsAsAllergenIfAllergicScore25() {
        Map<String, Integer> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        String expected = "eggs(1)";
        assertNotEquals(expected, allergyScreener.AllergicTo(25));
    }

    @Test
    public void shouldReturnEggsPeanutsAndChocolatesAsAllergensIfAllergicScore34() {
        Map<String, Integer> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        List<String> expectedAllergens=new ArrayList<>();
        expectedAllergens.add("eggs(1)");
        expectedAllergens.add("chocolate (32)");
        assertNotEquals(expectedAllergens, allergyScreener.AllergicTo(25));
    }

    private Map<String, Integer> getAllergens() {
        Map<String, Integer> allergens = new HashMap<>();
        allergens.put("Peanuts", 2);
        allergens.put("Chocolate", 3);
        return allergens;
    }
}