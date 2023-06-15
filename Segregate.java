import java.util.*;
public class Segregate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
       String ar=""; 
        String s= Integer.toString(a); //Typecasting
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='0'){
                ar=ar+'0'; //zeroes at end
            }
            else
            ar='1'+ar;  //1s at start
        }
    System.out.println(ar);
    }
}
