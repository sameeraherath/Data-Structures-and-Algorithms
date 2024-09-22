import java.util.ArrayList;
import java.util.List;
public class FindLargestInList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Check if the list is not empty
        if (numbers.isEmpty()) {


            System.out.println("List is empty");
            return;
        }

        int largest = numbers.get(0);
        int index = 1;

        // Loop through the list
        while (index<numbers.size()) {
            
            int currentNumber = numbers.get(index);
            if (currentNumber >  largest) {

                largest = currentNumber;

            }

            index++;

        }

        System.out.println("Largest number: " + largest);

    }
   
}
