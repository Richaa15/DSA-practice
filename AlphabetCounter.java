import java.util.Scanner;
public class AlphabetCounter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = sc.next();
        String output = compressString(input);
        System.out.println(output);
    }
    
    //This method will return compressed string
     public static String compressString(String input) { 
        StringBuilder outputBuilder = new StringBuilder();
        int count = 1; //count will keep track of count of consecutive characters.

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++; //increment count if same character repeats
            } else {
                outputBuilder.append(input.charAt(i - 1));
                outputBuilder.append(count);
                count = 1;
            }
        }
