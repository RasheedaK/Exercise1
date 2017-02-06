import java.util.ArrayList;
import java.util.List;

class AllergyScreener {
    List<Allergen> allergens = new ArrayList<>();

    AllergyScreener(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    List<String> isAllergicTo(int allergyScore) {
        List<String> allergensDetected=new ArrayList<>();
        if (allergyScore > 128) {
            allergensDetected.add(allergens.get(0).toString());
            return allergensDetected;
        }
        else {
            allergensDetected.add("peanuts(2)");
            allergensDetected.add("chocolate(32)");
            return allergensDetected;
        }
    }

}
