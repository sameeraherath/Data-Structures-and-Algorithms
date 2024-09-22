import java.util.Scanner;

public class ReverseInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int reversedNum = 0;

        while (number != 0) {

            int lastDigit = number % 10;
            reversedNum = reversedNum * 10 + lastDigit; // Build the reversed number
            number /= 10;
            
        }

        System.out.println("Reversed number: " + reversedNum);
        sc.close();
    }
}