public class ArrayOperations {

    public static void main(String[] args) {

        //initialize array
        int [] numbers = {1, 2, 3, 4, 5};

        //print array
        System.out.println("Array Elements: ");
        printArray(numbers);

        //Find the maximum value in the array
        System.out.println("Maximum Value: " + findMaxValue(numbers));

        //calculate sum of the array
        System.out.println("Sum : " + calculateSum(numbers));

        //Find the minimum value in the array
        System.out.println("Minimum Value: " + findMinValue(numbers));

        //Calculate average of the array
        System.out.println("Average :" + calculateAverage(numbers));
        


    }

    //Method to print array
    public static void printArray(int[] numbers) {

        for(int value: numbers) {

            System.out.println(value);

      }

    }

    //Method to find the maximum value in the array
    public static int findMaxValue(int[] array) {

        int max = array[0];
        for (int value: array) {

            if (value > max) {

                max = value;
            }

        }

        return max; 
    }

    //Method to calculate sum of the array
    public static int calculateSum(int[] array) {

    int sum = 0;
    for (int value: array) {
    
        sum += value;
    }

    return sum;

  }

  //Method to find the minimum value in the array
  public static int findMinValue(int[] array) {
      
       int min = array[0];
       for (int value: array) {

        if (value < min) {

            min = value;
        }    
    }

    return min;
  }

  //Method to calculate average of the array
  public static double calculateAverage(int[] array) {
      
    double sum = 0;
    for (int value : array) {

        sum += value;
       
    }
    
    double average = sum / array.length;
    return average;
        
  }





}