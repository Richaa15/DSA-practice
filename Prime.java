public class Prime{
    public static void main(String[] args) {
        int lR = 2;
        int uR = 100;

        System.out.println("Prime numbers between " + lR + " and " + uR + ":");
        printPrimeNumbers(lR, uR);
    }

    public static void printPrimeNumbers(int lR, int uR) {
        for (int num = lR; num <= uR; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
