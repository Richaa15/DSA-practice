import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
class MiddleElementLinkedList {
    public static void main(String[] args) {
        // Create a linked list from user input
        ListNode head = linkedList();

        // Find the middle element
        ListNode middle = findMiddleElement(head);
        System.out.println("Middle element: " + middle.val);
    }

    public static ListNode linkedList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return head.next;
    }
    public static ListNode findMiddleElement(ListNode head) {
        ListNode i = head;
        ListNode j = head;

        if(n%2==0){
            while ( i.next != null ) {
            j = j.next;
            i = i.next.next;
            }
        }else{
            while ( i.next.next != null ) {
            j = j.next;
            i = i.next.next;
            }
        }
        return j;
        }
}
