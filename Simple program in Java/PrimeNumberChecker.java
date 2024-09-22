import java.util.Scanner;
public class PrimeNumberChecker {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        
        boolean isPrime = true;
        int i = 2;

        if (number < 2) {

            isPrime = false;
            
        } else {

            while (i <= Math.sqrt(number)) {
                
                if (number % i == 0) {

                    isPrime = false;
                    break;
                    
                }

                i++;
            } 

            }

            if (isPrime) {

                System.out.println(number + " is a prime number.");
            } else {

                System.out.println(number + " is not a prime number.");
            }

            sc.close();

        }

        

       
}
    


