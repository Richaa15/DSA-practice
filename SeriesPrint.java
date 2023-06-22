//Task is to print N elements of series
//6, 28,66,120,190,276

import java.util.Scanner;

public class SeriesPrint {

    public static void printSeries(int n) {
        for(int i =1; i< n; i++) {
            int a = 2*i;
            int b = 4*i-1;
            System.out.println(a*b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        System.out.println("Series:");
        printSeries(n);
    }
}
