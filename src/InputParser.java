import java.util.Scanner;

class InputParser {
    private Scanner sc = new Scanner(System.in);

    Person getParsedInput() {
        String input = sc.nextLine();
        return getPerson(input);
    }

    private Person getPerson(String input) {
        int allergyScore = 0;
        String[] inputArray = input.split(" ");
        try {
            allergyScore = Integer.parseInt(inputArray[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
            quit();
        }
        return new Person(inputArray[0], allergyScore);
    }

    private void quit() {
        System.exit(1);
    }
}
