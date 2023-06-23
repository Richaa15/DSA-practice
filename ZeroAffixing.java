import java.util.Scanner;
public class ZeroAffixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range: ");
        int m = sc.nextInt();
        System.out.println("Enter ending range: ");
        int n = sc.nextInt();
        printWithZeroes(m, n);
    }

    public static void printWithZeroes(int m, int n) {
        int num = String.valueOf(n).length();

        for (int i = m; i <= n; i++) {
            String formattedNum = String.format("%0" + num + "d", i); //format the zeroes
            System.out.println(formattedNum);
            
            
        }
    }
}
