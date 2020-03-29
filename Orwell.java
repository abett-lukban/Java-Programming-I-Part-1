
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int taon = Integer.valueOf(skan.nextLine());
        
        if (taon == 1984) {
            System.out.println("Orwell");
        }
    }
}
