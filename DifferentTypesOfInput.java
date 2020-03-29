
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String valueString = scanner.nextLine();
        System.out.println("Give an integer:");
        int valueInteger = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double valueDouble = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean valueBoolean = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + valueString);
        System.out.println("You gave the integer " + valueInteger);
        System.out.println("You gave the double " + valueDouble);
        System.out.println("You gave the boolean " + valueBoolean);

    }
}
