import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = transformString(input);
        System.out.println(output);
    }

    public static String transformString(String input) {
        String[] a = input.split("-"); //delimeter "-"
        StringBuilder sb = new StringBuilder();

        for (String part : a) {
            sb.append(part);
        }
//format the string with it's original length.
        return String.format("%" + input.length() + "s", sb.toString()).replace(' ', '-'); //replace the spaces with dashes in the output string
    }
}
