import java.util.Scanner;
public class FindfFactorial {

    public static void main(String[] args) {

        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt(); // Take input from the user
        // Run the loop until number becomes 1
        while (number > 0) {

            factorial = factorial * number; 
            number--; // Decrease number by 1
        }

        System.out.println("Factorial: " + factorial);

        sc.close();
    }
}
