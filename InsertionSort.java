class InsertionSort {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node insertionSort(Node head) {
        Node dummy = new Node(0);
        Node curr = head;
        while (curr != null) {
            Node prev = dummy;
            while (prev.next != null && prev.next.data < curr.data) {
                prev = prev.next;
            }
            Node next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.print("Original List: ");
        printList(head);

        head = insertionSort(head);

        System.out.print("Sorted List: ");
        printList(head);
    }
}
