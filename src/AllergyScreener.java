import java.util.HashMap;
import java.util.Map;

class AllergyScreener {
    Map<String, Integer> allergens = new HashMap<>();

    AllergyScreener(Map<String, Integer> allergens) {
        this.allergens = allergens;
    }

    String AllergicTo(int allergyScore) {
        if(allergyScore>128)
            return "eggs(1)";
        return "";
    }

}
