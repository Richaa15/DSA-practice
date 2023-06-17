import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "(A+B*C)^D";
        postfixing(s);
    }

    public static void postfixing(String s) {
        Stack<Character> stack = new Stack<>();
        String postf = new String("");

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (Character.isLetterOrDigit(a)) {
                postf = postf + s.charAt(i);
            } else if (a == '(')
                stack.push(a);

            else if (a == ')') {
                while (!stack.isEmpty()
                        && stack.peek() != '(') {
                    post += stack.peek();
                    stack.pop();
                }
                stack.pop();
            }

            else {
                if (!stack.isEmpty()) {
                    if (precedence(a) >= precedence(stack.peek())) {
                        stack.push(s.charAt(i));
                    } else {
                        while (!stack.isEmpty()) {
                            post += stack.peek();
                            stack.pop();
                        }
                        stack.push(s.charAt(i));
                    }
                } else {
                    stack.push(s.charAt(i));
                }

            }

        }
        while (!stack.isEmpty()) {
            post += stack.peek();
            stack.pop();
        }

        System.out.println(post);
    }

    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
