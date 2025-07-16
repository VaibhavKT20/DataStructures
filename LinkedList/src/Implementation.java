class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Implementation {
    Node head;

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at a specific position (0-based index)
    public void insertAtPosition(int pos, int data) {
        if (pos < 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 0) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method for testing
    public static void main(String[] args) {
        Implementation list = new Implementation();

        list.insertAtHead(10);    // 10
        list.insertAtEnd(20);     // 10 -> 20
        list.insertAtHead(5);     // 5 -> 10 -> 20
        list.insertAtPosition(2, 15);  // 5 -> 10 -> 15 -> 20
        list.insertAtPosition(0, 1);   // 1 -> 5 -> 10 -> 15 -> 20
        list.insertAtPosition(1,100);
        list.printList();
    }
}




