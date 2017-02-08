import java.util.ArrayList;
import java.util.List;

class Dependency {
    static List<Allergen> getAllergensList() {
        List<Allergen> allergens = new ArrayList<>();
        allergens.add(new Allergen("eggs", 1));
        allergens.add(new Allergen("peanuts", 2));
        allergens.add(new Allergen("shellfish", 4));
        allergens.add(new Allergen("strawberries", 8));
        allergens.add(new Allergen("tomatoes", 16));
        allergens.add(new Allergen("chocolate", 32));
        allergens.add(new Allergen("pollen", 64));
        allergens.add(new Allergen("cats", 128));
        return allergens;
    }

}
