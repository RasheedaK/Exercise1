import java.util.List;

class Person {
    private final String name;
    private final int allergyScore;

    Person(String name, int allergyScore) {
        this.name = name;
        this.allergyScore = allergyScore;
    }

    List<Allergen> askForAllergyTest(AllergyScreener allergyScreener) {
        return allergyScreener.getAllergens(allergyScore);
    }

    String getName() {
        return name;
    }
}
