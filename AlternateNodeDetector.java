import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class AlternateNodeDetector {
    public static void main(String[] args) {
        // Create a linked list from user input
        ListNode head = createLinkedListFromInput();

        // Detect alternate nodes
        detectAlternateNodes(head);
    }

    public static ListNode createLinkedListFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void detectAlternateNodes(ListNode head) {
        ListNode current = head;
        boolean isAlternate = false;

        while (current != null) {
            if (isAlternate) {
                System.out.print(current.val + " ");
            }

            isAlternate = !isAlternate;
            current = current.next;
        }
    }
}
