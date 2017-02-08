import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        List<Allergen> allergens = new ArrayList<>();
        allergens.add(new Allergen("eggs", 1));
        allergens.add(new Allergen("peanuts", 2));
        allergens.add(new Allergen("shellfish", 4));
        allergens.add(new Allergen("strawberries", 8));
        allergens.add(new Allergen("tomatoes", 16));
        allergens.add(new Allergen("chocolate", 32));
        allergens.add(new Allergen("pollen", 64));
        allergens.add(new Allergen("cats", 128));
        AllergyScreener allergyScreener = new AllergyScreener(allergens);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.next();
        System.out.println("Enter your AllergyScore");
        int allergyScore = sc.nextInt();
        Person person=new Person(name,allergyScore);
        try {
            List<Allergen> detectedAllergens = person.askForAllergyTest(allergyScreener);
            if (detectedAllergens.isEmpty())
                System.out.println(person.getName()+" has no Allergies");
            else
                System.out.println(person.getName()+" is Allergic to " + detectedAllergens);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
