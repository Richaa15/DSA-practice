import java.util.*;
public class LongestSubarrayOf1 {
    public int longestSubarray(int[] nums, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            
            if(nums[i] == 1){
               count = 0;
               temp++;
                
            }
            else if(nums[i] == 0){
                list.add(temp);
                temp = 0;
                count++;
                if(count > 1){
                    list.add(0) ;
                }
            }
        }
        list.add(temp);
        int max = 0;
        if (list.size()<2){
            if (list.get(0) == n){
                max = n-1;
            }
            else{
                return list.get(0);
            }
               
        }
        
        for(int i = 0; i < list.size()-1; i++){
            max = Math.max(max, list.get(i)+list.get(i+1));
        }
       
        return max+1; //After flipping
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of binary array(n): ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int[] nums = new int[];
        for(int i =0; i<n;i++){
            nums[i]= sc.nextInt();
        }
        int x = longestSubarray(nums, n);
        System.out.println("Longest subsequence: " +x);
    }
}
