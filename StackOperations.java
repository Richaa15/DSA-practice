import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Peek at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
      
        // Check if the stack is full
        boolean isFull = stack.isFull();
        System.out.println("Is stack empty? " + isFull);

        // Get the size of the stack
        int size = stack.size();
        System.out.println("Size of stack: " + size);

        // Search for an element in the stack
        int elementToSearch = 10;
        int position = stack.search(elementToSearch);
        if (position != -1) {
            System.out.println("Element " + elementToSearch + " found at position " + position);
        } else {
            System.out.println("Element not found in the stack.");
        }
    }
}
