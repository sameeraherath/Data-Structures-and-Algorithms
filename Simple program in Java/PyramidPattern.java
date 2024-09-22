public class PyramidPattern {
    
    public static void main(String[] args) {
        
        int row = 5;
        int i = 1;

        while (i <= row) {
            int spaces = row - i;
            int stars = 2 * i - 1;
            
            // Print leading spaces
            int spaceCount = 0;
            while (spaceCount < spaces) {
                System.out.print(" "); 
                spaceCount++;
            }

            // Print stars
            int starCount = 0;
            while (starCount < stars) {
                System.out.print("⁕"); 
                starCount++;
            }

            
            System.out.println();
            i++;
        }
    }
}
