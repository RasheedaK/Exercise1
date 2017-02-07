import java.util.ArrayList;
import java.util.List;

class AllergyScreener {
    private List<Allergen> allergens = new ArrayList<>();
    private final int MAX_ALLERGIC_SCORE = 255;
    private final char BINARY_ONE = '1';
    private int maxScore;

    AllergyScreener(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    List<String> getAllergens(int allergyScore) {
        List<String> allergensDetected = new ArrayList<>();
        if (allergyScore > MAX_ALLERGIC_SCORE) {
            allergensDetected.add(allergens.get(0).toString());
            return allergensDetected;
        } else {
            return getAllergensIfScoreLessthanOrEqualtoMaxScore(allergyScore);
        }
    }

    private List<String> getAllergensIfScoreLessthanOrEqualtoMaxScore(int allergyScore) {
        List<String> allergensDetected = new ArrayList<>();
        String binaryInt = Integer.toBinaryString(allergyScore);
        String binaryString = new StringBuffer(binaryInt).reverse().toString();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == BINARY_ONE)
                allergensDetected.add(allergens.get(i).toString());
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
