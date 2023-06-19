class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int getCount() {           //To get the count of linked list.
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
    
    public int getMinimum() {          //To get minimum element of linked list.
        if (isEmpty()) {
            System.out.println("List is empty");
        }

        int min = head.value;
        Node temp = head.next;
        while (temp != null) {
            if (temp.value < min) {
                min = temp.value;
            }
            temp = temp.next;
        }
        return min;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(10);
        l.insert(20);
        l.insert(30);

        System.out.println("Count of list: " + l.getCount()); 
        
        System.out.println("Minimum element oflist is: " + l.getMinimum());
    }
}
