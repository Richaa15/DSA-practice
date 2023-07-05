import java.util.*;

public class KClosest {
    void closestK(int arr[], int n, int x, int k) {
        // Create a priority queue to store the elements based on their absolute difference from x
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a -> Math.abs(a - x)));

        // Add array elements to the priority queue
        for (int i = 0; i < n; i++) {
            pq.offer(arr[i]);
        }

        // Print the k closest elements
        int j = 0;
        while (j < k && !pq.isEmpty()) {
            System.out.println(pq.poll());
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter K: ");
        int k = sc.nextInt();

        KClosest kClosest = new KClosest();
        kClosest.closestK(arr, n, x, k);
    }
}
