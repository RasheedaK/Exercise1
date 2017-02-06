import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AllergyScreenerTest {
    @Test
    public void shouldReturnTrueForGivenAllergicScoreOnCallingIsAllergic() {
        Map<String, Integer> allergens = new HashMap<>();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        assertTrue(allergyScreener.isAllergic(24));
    }
}