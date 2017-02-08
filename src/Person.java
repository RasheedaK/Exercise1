import java.util.List;

class Person {
    private final String name;
    private final int allergyScore;
    private final AllergyScreener allergyScreener;

    Person(String name, int allergyScore,AllergyScreener allergyScreener) {
        this.name = name;
        this.allergyScore = allergyScore;
        this.allergyScreener=allergyScreener;
    }

    List<Allergen> askForAllergyTest(int allergyScore) {
        return allergyScreener.getAllergens(allergyScore);
    }

    String getName() {
        return name;
    }
}
