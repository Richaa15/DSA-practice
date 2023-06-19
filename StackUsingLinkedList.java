class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        }
        else{
        newNode.next = top;
        top = newNode;
        }
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("No elements to delete.");
            return -1;
        }
        else{
            int data = top.data;
            top = top.next;
            return data;
        }
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty therefore no elements to display.");
            return;
        }
        Node temp = top;
        System.out.println("Stack: " );
        while (temp!= null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public void peek() {
        System.out.println("Top element of stack: " + top.data);
    }
    
    public void length() {
        int c = 0;
        Node temp = top;
        temp = top;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        System.out.println("The size of the stack is: " + c);
    }
    




    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        
        s.display();
        
        s.pop();
        s.display();
        
        s.peek();
        
        s.length();
    }
}
