import java.util.Stack;

public class InfixToPostfix {

    // Function to return the precedence of an operator
    public static int precedence(char operator) {
        switch (operator) {
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

    // Function to convert infix expression to postfix expression
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the current character is an operand, append it to the result
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            // If the current character is an opening parenthesis, push it to the stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If the current character is a closing parenthesis, pop elements from the stack and append to the result until an opening parenthesis is encountered
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Pop the opening parenthesis from the stack
            }
            // If the current character is an operator
            else {
                // Pop operators from the stack and append to the result until an operator with lower precedence or an opening parenthesis is encountered
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch); // Push the current operator to the stack
            }
        }

        // Pop any remaining operators from the stack and append to the result
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid expression: Unbalanced parentheses";
            }
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "A+B*C-(D/E+F)*G";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix expression: " + infixExpression);
        System.out.println("Postfix expression: " + postfixExpression);
    }
}
