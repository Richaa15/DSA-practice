//Given an unsorted array A of size N that contains only non-negative integers,
//find a continuous sub-array that adds to a given number S and return the left and right indexes of that sub-array.
//In the case of multiple subarrays, return the subarray indexes that come first when moving from left to right.
//Note: Both the indexes in the array should be according to 1-based indexing. 
//You have to return an array list consisting of two elements, left and right. 
//If no such subarray exists, return an array consisting of element -1.

import java.util.Scanner;
public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int sum = A[0]; // Initialize sum with the first element
        int j = 0;
        
        for (int i = 1; i <= n; i++) { // Start the loop from index 1
            while (sum > target && j < i - 1) { // Adjust the condition and loop end condition
                sum = sum - A[j];
                j++;
            }
            if (sum == target) {
                System.out.println("First index: " + j + " Last index: " + (i - 1));
                break;
            }
            if (i < n) { // Avoid index out of bounds
                sum = sum + A[i]; // Update the sum with the next element
            }
        }
    }
}
