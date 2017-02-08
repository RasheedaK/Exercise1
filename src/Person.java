import java.util.List;

class Person {
    private final String name;
    private final int allergyScore;
    private AllergyScreener allergyScreener;

    Person(String name, int allergyScore, AllergyScreener allergyScreener) {
        this.name = name;
        this.allergyScreener = allergyScreener;
        this.allergyScore = allergyScore;
    }

    List<Allergen> askForAllergyTest() {
        return allergyScreener.getAllergens(allergyScore);
    }

    String getName() {
        return name;
    }
}
