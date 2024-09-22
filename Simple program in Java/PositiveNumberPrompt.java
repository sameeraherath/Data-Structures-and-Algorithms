import java.util.Scanner;
public class PositiveNumberPrompt {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = -1;

        while (number <= 0) {

            System.out.println("Enter a positive number: ");
            number = sc.nextInt();

            if (number <= 0) {

                System.out.println("The number is not positive. Please try again.");
                
            }
            
        }

        System.out.println("You entered a positive number: " + number);
        sc.close();
    }
}
