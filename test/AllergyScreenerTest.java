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
        List<String> expectedAllergens=new ArrayList<>();
        expectedAllergens.add("eggs(1)");
        assertEquals(expectedAllergens, allergyScreener.isAllergicTo(256));
    }

    @Test
    public void shouldNotReturnEggsAsAllergenIfAllergicScore25() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        List<String> expectedAllergens=new ArrayList<>();
        expectedAllergens.add("eggs(1)");
        assertNotEquals(expectedAllergens, allergyScreener.isAllergicTo(25));
    }

    @Test
    public void shouldReturnPeanutsAndChocolateAsAllergensIfAllergicScore34() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        List<String> expectedAllergens=new ArrayList<>();
        expectedAllergens.add("peanuts(2)");
        expectedAllergens.add("chocolate(32)");
        assertEquals(expectedAllergens, allergyScreener.isAllergicTo(34));
    }
    private List<Allergen> getAllergens() {
        List<Allergen> allergens = new ArrayList<>();
        allergens.add(new Allergen("eggs", 1));
        allergens.add(new Allergen("Chocolate", 3));
        return allergens;
    }
}