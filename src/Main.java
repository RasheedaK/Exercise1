import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Allergen> allergens = Dependency.getAllergensList();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        InputParser inputParser = new InputParser();
        Person person = inputParser.getParsedInput();
        List<Allergen> detectedAllergens = allergyScreener.getAllergens(person);
        if (detectedAllergens.isEmpty())
            System.out.println(person.getName() + " has no Allergies");
        else
            System.out.println(person.getName() + " is Allergic to " + detectedAllergens);
    }
}
