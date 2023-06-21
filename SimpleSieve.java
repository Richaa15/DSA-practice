import java.util.Arrays;
public class SimpleSieve{
public static void main(String[] args) {
        int lR = 2;
        int uR = 100;

        System.out.println("Prime numbers between " + lR + " and " + uR + ":");
        boolean[] s = simpleSieve(uR);
        printPrimeNumbers(s, lR, uR);
    }


    public static boolean[] simpleSieve(int n) {  //Take n
        boolean[] s = new boolean[n + 1]; //Create boolean array [n+1]
        Arrays.fill(s, true); //Take initial value as true.(from index 2)

        s[0] = false; 
        s[1] = false;
//Take multiples of each value and mark them as false.
        for (int i = 2; i * i <= n; i++) { 
            if (s[i]) { 
                for (int j = i * i; j <= n; j += i) {
                    s[j] = false;
                }
            }
        }

        return s;
    }
    public static void printPrimeNumbers(boolean[] s, int lR, int uR) {
        for (int num = lR; num <= uR; num++) {
            if (s[num]) {
                System.out.println(num);
            }
        }
    }
}
