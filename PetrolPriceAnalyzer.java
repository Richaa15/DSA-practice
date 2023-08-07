import java.util.Scanner;

public class PetrolPriceAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive number of days.");
            return;
        }

        int[] prices = new int[n];
        System.out.println("Enter the petrol prices for each day:");

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int maxPrice = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;
        int maxDay = -1;
        int minDay = -1;

        for (int i = 0; i < n; i++) {
            if (prices[i] > maxPrice || (prices[i] == maxPrice && i > maxDay)) {
                maxPrice = prices[i];
                maxDay = i;
            }

            if (prices[i] < minPrice || (prices[i] == minPrice && i < minDay)) {
                minPrice = prices[i];
                minDay = i;
            }
        }

        System.out.println("Maximum price of petrol: " + maxPrice + " on day " + (maxDay + 1));
        System.out.println("Minimum price of petrol: " + minPrice + " on day " + (minDay + 1));

        scanner.close();
    }
}
