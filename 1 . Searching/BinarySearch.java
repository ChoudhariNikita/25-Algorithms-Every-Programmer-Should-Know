import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the sorted array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        // Binary search requires a sorted array, so we'll sort it first.
        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}

/*
1. Import Statements:
   - The code starts with two import statements:
     - `import java.util.Arrays;`: This import allows you to use the `Arrays.sort` method to sort the array.
     - `import java.util.Scanner;`: This import allows you to take user input using the `Scanner` class.

2. `BinarySearch` Class:
   - This is the main class that contains the binary search algorithm and the `main` method for user interaction.

3. `binarySearch` Method:
   - This method performs the binary search on a sorted array to find a target element.
   - It takes two arguments: the sorted array (`arr`) and the target element (`target`).
   - It initializes two pointers, `left` and `right`, to the start and end of the array, respectively.
   - It enters a `while` loop that continues until `left` is less than or equal to `right`.
   - Inside the loop, it calculates the middle index `mid` of the current search range.
   - It compares the element at the `mid` index with the `target`:
     - If they are equal, it returns `mid` as the index where the `target` element is found.
     - If the element at `mid` is less than the `target`, it updates `left` to `mid + 1`, indicating that the search should continue in the right half of the array.
     - If the element at `mid` is greater than the `target`, it updates `right` to `mid - 1`, indicating that the search should continue in the left half of the array.
   - If the loop exits without finding the target, it returns -1 to indicate that the element was not found in the array.

4. `main` Method:
   - The `main` method is where the program starts executing.
   - It creates a `Scanner` object (`sc`) to read user input.
   - It prompts the user to enter the length of the sorted array and reads the input into the variable `len`.
   - It creates an integer array `arr` of length `len` to store the sorted elements.
   - It then prompts the user to enter the sorted elements one by one and stores them in the `arr` array.
   - The user is also prompted to enter the element (`target`) they want to search for.
   - Before performing the binary search, the program sorts the `arr` array using `Arrays.sort`.
   - It then calls the `binarySearch` method to search for the `target` element in the sorted array.
   - Finally, it prints whether the element was found or not.

5. Resource Cleanup:
   - The program closes the `Scanner` (`sc`) to release system resources when it's done with user input.

Overall, this Java program allows users to perform a binary search on a sorted array to find a target element and provides feedback on whether the element was found or not.
*/
