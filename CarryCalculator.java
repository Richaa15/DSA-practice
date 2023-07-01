import java.util.*;
public class CarryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int carries = calculateCarries(num1, num2);
        System.out.println("Number of carries: " + carries);
    }

    public static int calculateCarries(int num1, int num2) {
        int carries = 0;
        int c = 0;

        while (num1 != 0 || num2 != 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;

            int sum = d1 + d2 + c;

            if (sum >= 10) {
                carries++;
                c = 1;
            } else {
                c = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        return carries;
    }
}
