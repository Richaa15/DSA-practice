//Print 1 if the target is present in every subset of array.
import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array :");
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        int target = sc.nextInt()

        System.out.println("Enter the Elements of the Array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        System.out.println("Size of the subset :");
        int sub = sc.nextInt();
        
        int k = 0;
        int num = n/sub;
        System.out.println("No. of the subsets :" + num);

        int count = 0;
        for (int i = 0; i < n; i = i+3) {
            for (int j = 0; j < sub; j++) {

                if(arr[k++] == target){

                count++;
                }
            }
        }
        if(count == num){
            System.out.println("1");
            return;
        }
        System.out.println("0");

    }
}
