class Person {
    private final String name;
    private final int allergyScore;

    Person(String name, int allergyScore) {
        this.name = name;
        this.allergyScore = allergyScore;
    }

    String getName() {
        return name;
    }

    int getallergyScore() {
        return allergyScore;
    }
}
