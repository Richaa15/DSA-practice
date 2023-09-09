import java.util.*;
public class SeparateLettersAndDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> charStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();

        boolean isValid = true;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                numStack.push(Integer.parseInt(String.valueOf(c)));
            } else if (Character.isAlphabetic(c)){
                charStack.push(c);
            } else{
                isValid = false;
                break;
            }
        }
        String rs1 = "";
        int rs2 = 0;
        if(isValid){
            while(!charStack.isEmpty()){
                rs1 = charStack.pop() + rs1;
            }
            System.out.println(rs1);
            while(!numStack.isEmpty()){
                int num = numStack.pop();
                rs2 = rs2*10 + num;
            }
            while(rs2!= 0){
                System.out.print(rs2%10);
                rs2 = rs2/10;
            }
        }
    }
}
