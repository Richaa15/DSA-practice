import java.util.*;

public class KClosest {
    void closestK(int arr[], int n, int x, int k) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - x);
            if (!map.containsKey(diff)) {
                map.put(diff, new ArrayList<>());
            }
            map.get(diff).add(arr[i]);
        }

        int count = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> values = entry.getValue();
            for (int value : values) {
                System.out.println(value);
                count++;
                if (count == k) {
                    return;
                }
            }
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
