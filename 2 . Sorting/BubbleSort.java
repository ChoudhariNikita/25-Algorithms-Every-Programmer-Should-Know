public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    /*
    Code explanation:
    
The Java program you've provided implements the Bubble Sort algorithm. Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. Here's a step-by-step explanation of the code:

BubbleSort Class:

This is the main class that contains the bubbleSort method for sorting an array using the Bubble Sort algorithm and the main method for demonstration.
bubbleSort Method:

bubbleSort is a static method that takes an integer array arr as its input and sorts it in ascending order using the Bubble Sort algorithm.
It starts by getting the length of the array n.
The variable swapped is used to track whether any swaps were made in the inner loop. It is initially set to false.
There are two nested for loops:
The outer loop (i) runs from 0 to n - 1. It represents the number of passes through the array.
The inner loop (j) runs from 0 to n - i - 1. It represents the elements to compare and swap.
Inside the inner loop, it compares arr[j] and arr[j + 1]. If arr[j] is greater than arr[j + 1], it swaps them to bring the smaller element towards the beginning of the array.
After each pass of the inner loop, if no swaps were made (swapped is still false), it means the array is already sorted, and the algorithm breaks out of the outer loop.
main Method:

The main method is where the program starts executing.
It initializes an integer array arr with unsorted values.
It prints the original array using the printArray method.
It then calls the bubbleSort method to sort the array.
Finally, it prints the sorted array using the printArray method.
printArray Method:

printArray is a static method that takes an integer array arr as its input and prints its elements.
It iterates through the array and prints each element followed by a space.
After printing all elements, it adds a newline character to move to the next line.
Here's a brief example of how the program works:

Original Array: [64, 34, 25, 12, 22, 11, 90]
After sorting with Bubble Sort:
Sorted Array: [11, 12, 22, 25, 34, 64, 90]
Bubble Sort is not the most efficient sorting algorithm, especially for large arrays, but it's easy to understand and implement for educational purposes.
    
    */

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
