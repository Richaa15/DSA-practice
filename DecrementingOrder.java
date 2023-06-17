import java.util.Scanner;
public class DecrementingOrder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
         boolean isDecreasing = checkDecrementing(number);
        if (isDecreasing) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static boolean checkDecrementing(int number) {
        int prevDigit = 9; //Initializing prevDigit
        while (number > 0) {
            int currDigit = number % 10;
            if (currDigit > prevDigit) {
                return true;
            }
            prevDigit = currDigit; //Assigning current digit to previous digit
            number /= 10;
        }
        return false;
    }
}
