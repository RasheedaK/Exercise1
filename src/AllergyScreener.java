import java.util.ArrayList;
import java.util.List;

class AllergyScreener {
    private final List<Allergen> allergens;
    private final char BINARY_ONE = '1';

    AllergyScreener(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    List<Allergen> getAllergens(Person person) {
        List<Allergen> allergensDetected = new ArrayList<>();
        if (person.getallergyScore() > getMaxAllergicScore()) {
            allergensDetected.add(allergens.get(0));
            return allergensDetected;
        } else {
            return getAllergensForLowScore(person.getallergyScore());
        }
    }

    private List<Allergen> getAllergensForLowScore(int allergyScore) {
        List<Allergen> allergensDetected = new ArrayList<>();
        String binaryString = new StringBuffer(Integer.toBinaryString(allergyScore)).reverse().toString();
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
