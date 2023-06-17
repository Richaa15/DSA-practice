public class ParenthesisCheck {

    public static boolean isValid(String s) {
        
        Stack<Character> startSymbols = new Stack<>();
        
        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                startSymbols.push(c);
            }
            
            else if (c == ')' && !startSymbols.isEmpty() && startSymbols.peek() == '(') {
                startSymbols.pop();
            } else if (c == '}' && !startSymbols.isEmpty() && startSymbols.peek() == '{') {
                startSymbols.pop();
            } else if (c == ']' && !startSymbols.isEmpty() && startSymbols.peek() == '[') {
                startSymbols.pop();
            }
            else {
                return false;
            }
        }
        return startSymbols.isEmpty();
    }

    public static void main(String[] args){
        String str="[([])]";
        boolean a = isValid(str);
        System.out.println("a="+a);
    }
}
