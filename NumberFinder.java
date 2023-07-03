import java.util.*;

public class NumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower Range: ");
        int lR = sc.nextInt();
        System.out.println("Enter the Upper Range: ");
        int uR = sc.nextInt();

        List<Integer> numbers = findNumbers(lR, uR);
        
        System.out.println("Numbers that contain 1, 4, or 9:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static List<Integer> findNumbers(int lR, int uR) {
        List<Integer> result = new ArrayList<>();

        for (int i = lR; i <= uR; i++) {
            if (containsDigits(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static boolean containsDigits(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit == 1 || digit == 4 || digit == 9) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
