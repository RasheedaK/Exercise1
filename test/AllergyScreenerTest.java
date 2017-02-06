import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AllergyScreenerTest {
    @Test
    public void shouldReturnTrueForGivenAllergicScoreOnCallingIsAllergic() {
        Map<String, Integer> allergens = getMap();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        assertTrue(allergyScreener.isAllergic(24));
    }

    @Test
    public void shouldReturnFalseForGivenAllergicScoreOnCallingIsAllergic() {
        Map<String, Integer> allergens = getMap();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        assertFalse(allergyScreener.isAllergic(256));
    }

    private Map<String, Integer> getMap() {
        Map<String, Integer> allergens = new HashMap<>();
        allergens.put("Peanuts",2);
        allergens.put("Chocolate",3);
        return allergens;
    }
}