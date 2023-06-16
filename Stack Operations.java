public class StackOperations {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackOperations(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    
     public boolean isEmpty() {
        if (top == -1)
        {
        return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull() {
        if (top == maxSize - 1){
        return true;
        }else{
            return false;
        }
    }

    public int size() {
        return top + 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element " + value);
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop/delete element.");
            return -1;
        } else {
            int delElement = stackArray[top];
            top--;
            return delElement;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }
    
    public void display(){
        if(isEmpty()) {
            System.out.println("The stack is empty hence can't display any elements.");
        }
        else{
            for(int i =0; i<= top; i++)
            {
                System.out.println(stackArray[i]);
            }
        }
    }


    public static void main(String[] args) {
        StackOperations stack = new StackOperations(5);

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        int delElement = stack.pop();
        System.out.println("Popped element: " + delElement);

        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
        
        boolean isFull = stack.isFull();
        System.out.println("Is the stack full? " + isFull);
        

        int size = stack.size();
        System.out.println("Size of stack: " + size);
        
        stack.display();
        
        

    
    }
}
