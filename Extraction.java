//Extract all the numbers from a string and print the max of them.
import java.util.*;

class Extraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        int count=0, rem=0, digit = 0;
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            int number = (int) c;         // (str.charAt(i) -0) char - int will give int
            if(number >=60){
                count = 0;
            }
            if(number>47 && number < 58){
                digit = number-48;
                count = count * 10 + digit;
            }
            rem = Math.max(count,rem);
            
        }
        System.out.println("Max Number: " + rem);
    }
}

