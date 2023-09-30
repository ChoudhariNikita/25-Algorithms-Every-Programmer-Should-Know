
import java.util.Random;

public class FindMinMaxInArray {
    public static void main(String[] args) {
        // Define the size of the array
        int size = 10;
        
        // Create an array of integers
        int[] numbers = new int[size];
        
        // Generate random integers and fill the array
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100); // Generates random integers between 0 and 99
        }
        
        // Print the generated array
        System.out.println("Generated Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline
        
        // Find the maximum and minimum values in the array
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        // Print the maximum and minimum values
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}
/*

In this code:

1. We define the size of the array (in this case, it's 10 elements).

2. We create an array called `numbers` to store integers.

3. We use the `Random` class to generate random integers between 0 and 99 and fill the array with these values.

4. The generated array is printed to the console.

5. We then find the maximum and minimum values in the array by iterating through it and updating the `max` and `min` variables accordingly.

6. Finally, we print the maximum and minimum values found in the array.

This code showcases array manipulation, random number generation, and finding extremum values within an array. It's a simple yet interesting example of working with arrays in Java.
  */
