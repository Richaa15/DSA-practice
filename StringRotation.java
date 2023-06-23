import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String in = scanner.nextLine();

        // Number of positions to shift
        System.out.print("Enter the number of positions to shift: ");
        int s = scanner.nextInt();

        // Direction (L or R)
        System.out.print("Enter the direction (L or R): ");
        char d = scanner.next().charAt(0);

        

        // Rotate the string
        String rotatedString = rotateString(in, s, d);

        // Print the output
        System.out.println("Rotated string: " + rotatedString);
    }

    private static String rotateString(String in, int s, char d) {
        int l = in.length();

        // Normalize shift value within the string length
        s = s % l;

        if (s < 0) {
            s += l;
        }

        StringBuilder sb = new StringBuilder(l);

        if (d == 'L') {
            // Rotate left
            sb.append(in.substring(s)).append(in.substring(0, s));
        } else {
            // Rotate right
            sb.append(in.substring(l - s)).append(in.substring(0, l - s));
        }

        return sb.toString();
    }
}
