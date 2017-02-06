import java.util.HashMap;
import java.util.Map;

class AllergyScreener {
    Map<String, Integer> allergens = new HashMap<>();

    AllergyScreener(Map<String, Integer> allergens) {
        this.allergens = allergens;
    }

    boolean isAllergic(int allergyScore) {
        return (allergyScore<128);
    }
}
