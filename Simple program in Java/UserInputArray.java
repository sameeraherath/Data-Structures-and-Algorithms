import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Get 5 user inputs and store them in the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the array using a foreach loop
        System.out.println("The numbers you entered are:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Close the scanner
        scanner.close();
    }
}
