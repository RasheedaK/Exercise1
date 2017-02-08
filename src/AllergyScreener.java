import java.util.ArrayList;
import java.util.List;

class AllergyScreener {
    private List<Allergen> allergens = new ArrayList<>();
    private final char BINARY_ONE = '1';

    AllergyScreener(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    List<Allergen> getAllergens(int allergyScore) {
        List<Allergen> allergensDetected = new ArrayList<>();
        if (allergyScore > getMaxAllergicScore()) {
            allergensDetected.add(allergens.get(0));
            return allergensDetected;
        } else {
            return getHighAllergens(allergyScore);
        }
    }

    private List<Allergen> getHighAllergens(int allergyScore) {
        List<Allergen> allergensDetected = new ArrayList<>();
        String binaryInt = Integer.toBinaryString(allergyScore);
        String binaryString = new StringBuffer(binaryInt).reverse().toString();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == BINARY_ONE)
                allergensDetected.add(allergens.get(i));
        }
        return allergensDetected;
    }

    int getMaxAllergicScore() {
        int score = 0;
        for (Allergen allergen : allergens) {
            score += allergen.getAllergenValue();
        }
        return score;
    }
}
