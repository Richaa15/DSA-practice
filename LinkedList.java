//Creating a linked list
public class LinkedList {  //LinkedList class represent the linked list
    class Node{  //node class is for node representation
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    public Node head = null;  //head
    public Node tail = null;  //tail
      
    public void addNode(int data) {  
        //new node  
        Node newNode = new Node(data);  
          
        if(head == null) {  //empty
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            tail.next = newNode;  //changing next address to newNode's address
            tail = newNode;  //newNode = newTail
        }  
    }  
    //fn to print nodes of linked list
    public void display() {  
        Node temp = head;  
          
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of linked list: ");  
        while(temp != null) {  
            System.out.print(temp.data + " ");  
            temp = temp.next;  
        }  
        System.out.println();  
    }  
    //Insert at Beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == newNode){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void insertAtAPosition(int data, int p){
        Node newNode = new Node(data);
        if (p == 1){
             newNode.next = head;
             head = newNode;
        }else{
            Node temp = head;
            Node temp1;
            for(int i = 0; temp.next!= null && i<p-1; i++)
            {
                temp = temp.next;
            }
            temp1 = temp.next;
            newNode.next = temp1;
            temp.next = newNode;
        }
        
        
    }
    
     public void deleteStart() {
        Node temp = head;
        head = temp.next;
    }

    public void deleteEnd() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    
    public static void main(String[] args) {  
          
        LinkedList lList = new LinkedList();  
          
        //Adding nodes  
        lList.addNode(1);  
        lList.addNode(2);  
        lList.addNode(3);  
        lList.addNode(4); 
        lList.addNode(5);
          
        lList.display();  
        
        lList.insertAtBeginning(9);
        
        lList.display();
        
        lList.insertAtEnd(33);
        
        lList.display();
        
        lList.insertAtAPosition(26, 3);
        
        lList.display();
        
        lList.deleteStart();
        
        lList.display();
        
        lList.deleteEnd();
        
        lList.display();
        
    }  
}  
