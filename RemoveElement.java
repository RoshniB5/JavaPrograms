class RemoveElement {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node remove(Node head, int key) {
        if (head == null) return head;
        if (head.data == key) return head.next;
        Node curr = head;
        while (curr.next != null && curr.next.data != key) {
            curr = curr.next;
        }
        if (curr.next != null) curr.next = curr.next.next;
        return head;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        print(head);

        head = remove(head, 3);
        System.out.print("Updated List: ");
        print(head);

        head = remove(head, 1);
        System.out.print("Updated List: ");
        print(head);

        head = remove(head, 6);
        System.out.print("Updated List: ");
        print(head);
    }
}
