//to rotate array as per given d
//input:1 2 3 4 5
//output: 3 4 5 1 2
import java.util.*;
public class ArrayRotation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter d: ");
        int d = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr, n, d);

    }

    public static void rotate(int[] arr, int n, int d) {

        int diff = n - d;
        reverse(arr, 0, d-1); //reverse starting d elements
        reverse(arr, diff-1, n - 1); //reverse rest of the elements after d
        reverse(arr, 0, n - 1); //reverse the whole resulting array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//function to reverse the array.
    public static void reverse(int[] arr, int start, int end) {

        int j = end;
        for (int i = start; i <= j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}
