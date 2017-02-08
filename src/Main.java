import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        List<Allergen> allergens = Dependency.getAllergensList();
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        InputReader inputReader = new InputReader();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = inputReader.takeStringInput();
        System.out.println("Enter your AllergyScore");
        int allergyScore = 0;
        try {
            allergyScore = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        Person person = new Person(name, allergyScore, allergyScreener);
        List<Allergen> detectedAllergens = person.askForAllergyTest(allergyScore);
        if (detectedAllergens.isEmpty())
            System.out.println(person.getName() + " has no Allergies");
        else
            System.out.println(person.getName() + " is Allergic to " + detectedAllergens);
    }
}
