import java.util.Scanner;

public class SwapNibbles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number between 0 and 255: ");
        int decimal = scanner.nextInt();
        
        byte num = (byte) decimal;
        
        // Swapping the nibbles
        int x = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
        
        System.out.println("Original decimal: " + decimal);
        System.out.println("Swapped decimal:  " + x);
    }
}
