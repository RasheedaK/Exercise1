import java.util.ArrayList;
import java.util.List;

class AllergyScreener {
    private List<Allergen> allergens = new ArrayList<>();

    AllergyScreener(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    List<String> isAllergicTo(int allergyScore) {
        List<String> allergensDetected = new ArrayList<>();
        if (allergyScore > 255) {
            allergensDetected.add(allergens.get(0).toString());
            return allergensDetected;
        } else {
            return getAllergensIfScoreLessthanOrEqualto128(allergyScore);
        }
    }

    private List<String> getAllergensIfScoreLessthanOrEqualto128(int allergyScore) {
        List<String> allergensDetected = new ArrayList<>();
        String binaryInt = Integer.toBinaryString(allergyScore);
        String binaryString = new StringBuffer(binaryInt).reverse().toString();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1')
                allergensDetected.add(allergens.get(i).toString());
        }
        return allergensDetected;
    }

}
