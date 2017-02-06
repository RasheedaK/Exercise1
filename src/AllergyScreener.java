import java.util.ArrayList;
import java.util.List;

class AllergyScreener {
    List<Allergen> allergens=new ArrayList<>();

    AllergyScreener(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    String isAllergicTo(int allergyScore) {
        if(allergyScore>128)
            return allergens.get(0).toString();
        return "";
    }

}
