import java.util.Arrays;
public class PairDivisionChecker {
    public static boolean nPairs(int[] nums, int n) {
        // Sort the array to group equal elements together
        Arrays.sort(nums);

        // Check if each pair has equal elements
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array(2n): ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int nums[] = new int[n];
        if(n%2==0){
            for(int i = 0; i<n; i++){
                nums[i] = sc.nextInt();
            }
        }
        else{
            System.out.println("Please enter valid n.");
        }
        boolean x = nPairs(nums, n);

        if (x) {
            System.out.println("The array can be divided into pairs.");
        } else {
            System.out.println("The array cannot be divided into pairs.");
        }
    }
}
