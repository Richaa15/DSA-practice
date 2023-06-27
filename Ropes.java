import java.util.*;
public class Ropes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int temp = 0;
        int cost = 0;
        for (int i = 0; i+1 < arr.length; i++) {
            Arrays.sort(arr);
            arr[i + 1] = arr[i + 1] + arr[i];
            cost = arr[i+1];
            temp = temp + cost;
        }
        ;
        System.out.println("Total length : " + cost);
        System.out.println("Total cost : "+ temp);
    }
}
