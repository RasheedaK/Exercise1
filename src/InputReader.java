import java.util.Scanner;

class InputReader {
    Scanner sc = new Scanner(System.in);

    Person getInput() {
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        return new Person(arr[0], Integer.parseInt(arr[1]));
    }

}
