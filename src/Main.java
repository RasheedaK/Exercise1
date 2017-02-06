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
        System.out.println("Enter AllergyScore");
        Scanner sc = new Scanner(System.in);
        int allergyScore=0;
        try {
            allergyScore = sc.nextInt();
            System.out.println("Allergic to "+allergyScreener.isAllergicTo(allergyScore));
        }catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}
