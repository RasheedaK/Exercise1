public class Allergen {
    private final String name;
    private final int value;

    Allergen(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name+"("+value+")";
    }
}
