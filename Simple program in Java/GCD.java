import java.util.Scanner;
public class GCD {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        while (b != 0) {

            int remainder = a % b;
            a = b;
            b = remainder;
            
        }

        System.out.println("GCD: " + a);
        sc.close();


    }
}
