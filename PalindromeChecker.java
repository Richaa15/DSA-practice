import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); 

        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int[] charCount = new int[26]; // Array to store character counts
        
        // Count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            //increment the count of respective index of array.
            charCount[c - 'a']++;
        }

        int oddCount = 0; // Number of characters with odd count

        // Count the number of characters with odd count
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1; // Return true if odd count is 0 or 1
    }
}
