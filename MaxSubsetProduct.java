import java.util.Arrays;
import java.util.Scanner;

public class MaxSubsetProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the subset size: ");
        int s = sc.nextInt();

        int maxP = findMaxSubsetProduct(arr, s);
        System.out.println("Maximum subset product: " + maxP);
    }

    public static int findMaxSubsetProduct(int[] arr, int s) {
        int maxP = Integer.MIN_VALUE;
        int n = arr.length;
        int p = 0;//will store the product.
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<s; j++){
                p = arr[i]*arr[j];
            }
            maxP = Math.max(maxP, p); //compare product with maximum product
        }
        return maxP;

    }
}
