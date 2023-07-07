import java.util.*;
public class NRepeated{
    public static int notUnique(int nums[], int n){
        
        int c = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == c) {
                return nums[i];
            }
        }
        // If no repeated element found
        return -1;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array(2n): ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int arr[] = new int[n];
        if(n%2==0){
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
        }
        else{
            System.out.println("Please enter valid n.");
        }
        
        
        int r = notUnique(arr,n);
        if (r != -1) {
            System.out.println("The element that has repeated n times: " + r);
        } else {
            System.out.println("No repeated element found.");
        }
    }
}
