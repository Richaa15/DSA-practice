import java.util.Arrays;
import java.util.Stack;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        // Remove any spaces and convert both strings to lowercase
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the strings are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Create stacks to hold the characters
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        // Push characters from the sorted arrays onto the stacks
        for (int i = charArray1.length - 1; i >= 0; i--) {
            stack1.push(charArray1[i]);
            stack2.push(charArray2[i]);
        }

        // Pop characters from the stacks and compare
        while (!stack1.isEmpty()) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}

