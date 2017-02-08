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
        List<Allergen> expectedAllergens = new ArrayList<>();
        expectedAllergens.add(allergens.get(0));
        assertEquals(expectedAllergens, allergyScreener.getAllergens(256));
    }

    @Test
    public void shouldNotReturnEggsAsAllergenIfAllergicScore25() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        List<Allergen> expectedAllergens = new ArrayList<>();
        expectedAllergens.add(allergens.get(0));
        assertNotEquals(expectedAllergens, allergyScreener.getAllergens(25));
    }

    @Test
    public void shouldReturnPeanutsAndChocolateAsAllergensIfAllergicScore34() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        List<Allergen> expectedAllergens = new ArrayList<>();
        expectedAllergens.add(allergens.get(1));
        expectedAllergens.add(allergens.get(5));
        assertEquals(expectedAllergens, allergyScreener.getAllergens(34));
    }

    @Test
    public void shouldReturnPeanutsAndEggsAsAllergensIfAllergicScore3() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        List<Allergen> expectedAllergens = new ArrayList<>();
        expectedAllergens.add(allergens.get(0));
        expectedAllergens.add(allergens.get(1));
        assertEquals(expectedAllergens, allergyScreener.getAllergens(3));
    }

    @Test
    public void shouldNotReturnPeanutsAndEggsAsAllergensIfAllergicScore36() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        List<Allergen> expectedAllergens = new ArrayList<>();
        expectedAllergens.add(allergens.get(0));
        expectedAllergens.add(allergens.get(1));
        assertNotEquals(expectedAllergens, allergyScreener.getAllergens(36));
    }

    @Test
    public void isAllergicToLotsOfStuff() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        List<Allergen> expectedAllergens = new ArrayList<>();
        expectedAllergens.add(allergens.get(3));
        expectedAllergens.add(allergens.get(4));
        expectedAllergens.add(allergens.get(5));
        expectedAllergens.add(allergens.get(6));
        expectedAllergens.add(allergens.get(7));
        assertEquals(expectedAllergens, allergyScreener.getAllergens(248));
    }

    @Test
    public void shouldReturnMaxScoreAs255ForGivenAllergensList() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        assertEquals(255, allergyScreener.getMaxAllergicScore());
    }

    @Test
    public void shouldNotReturnMaxScoreAs25ForGivenAllergensList() {
        List<Allergen> allergens = getAllergens();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        assertNotEquals(25, allergyScreener.getMaxAllergicScore());
    }

    private List<Allergen> getAllergens() {
        List<Allergen> allergens = new ArrayList<>();
        allergens.add(new Allergen("eggs", 1));
        allergens.add(new Allergen("peanuts", 2));
        allergens.add(new Allergen("shellfish", 4));
        allergens.add(new Allergen("strawberries", 8));
        allergens.add(new Allergen("tomatoes", 16));
        allergens.add(new Allergen("chocolate", 32));
        allergens.add(new Allergen("pollen", 64));
        allergens.add(new Allergen("cats", 128));
        return allergens;
    }
}