import java.util.*;
public class SecondLargestAddition {
    public static int addSecondLargestElements(int[] arr) {
        // Separate odd and even index elements into separate arrays
        int[] oddArr = new int[arr.length / 2 + 1];
        int[] evenArr = new int[arr.length / 2];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenArr[i / 2] = arr[i];
            } else {
                oddArr[i / 2] = arr[i];
            }
        }

        // Sort the arrays in descending order
        Arrays.sort(oddArr);
        Arrays.sort(evenArr);

        // Find the second-largest elements
        int secondLargestOdd = oddArr[oddArr.length - 2];
        int secondLargestEven = evenArr[evenArr.length - 2];

        // Add the second-largest elements and return the result
        return secondLargestOdd + secondLargestEven;
    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ")
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ")
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(6);
        }
        int result = addSecondLargestElements(arr);
        System.out.println("Sum of the second-largest elements: " + result);
    }
}
