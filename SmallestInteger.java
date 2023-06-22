//java code to find the smallest int value 'b' for given value of 'a'. 
//If we multiply the digits of b we should get the exact value of 'a'.

public class SmallestInteger {

    public static int findSmallest(int a) {
        if (a < 10) {
            return a+10; // Special case
        }

        int b = 0;
        int m = 1;//m is multiplier variable which  keeps track of the place value of the digits of b.

        // Starting from 9 and going down to 2 because we want the smallest digits
        for (int i = 9; i > 1; i--) {
            while (a % i == 0) {
                b += i * m; 
                m *= 10;
                a /= i;
            }
        }

        if (a != 1) {
            return -1; // No solution found
        }

        return b;
    }

    public static void main(String[] args) {
        int a = 23;
        int smallestB = findSmallest(a);

        if (smallestB != -1) {
            System.out.println("The smallest integer 'b' for a = " + a + " is " + smallestB);
        } else {
            System.out.println("No solution found for a = " + a); //for prime numbers
        }
    }
}

