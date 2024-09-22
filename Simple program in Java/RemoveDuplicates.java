import java.util.ArrayList;
import java.util.List;
public class RemoveDuplicates {

    public static void main(String[] args) {
        
        List <Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(10);
        number.add(20);


        // List to hold unique elements
        List<Integer> uniqueNumbers = new ArrayList<>();

        int index = 0;
        while (index < number.size()) {
            
            Integer current = number.get(index);
            if (!uniqueNumbers.contains(current)) {

                uniqueNumbers.add(current);

            
        }

        index++;

    }

    System.out.println("Unique numbers: " + uniqueNumbers);

  }

}
