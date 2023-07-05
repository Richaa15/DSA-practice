import java.util.*;
public class BinaryPallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
System.out.println("Enter the number: ");
        int n=sc.nextInt();
        String s= Integer.toBinaryString(n);
        System.out.println(s);
        int a = Integer.parseInt(s);
        int b=0;
        while(a>0){
            b= a%10;
            a=a/10;
        }


        if(a==b){
            System.out.println("It is Binary Pallendrome"+s);
        }else{
            System.out.println("It is not a Binary Palliendrome"+s);
        }
    }
}
