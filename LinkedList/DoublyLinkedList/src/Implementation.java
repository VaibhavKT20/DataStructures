class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
        prev=null;
    }
}

public class Implementation {
    public static Node insertAtBegin(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        if(head!=null){
            head.prev=temp;
        }
        return temp;
    }

    public static void printDDL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertAtBegin(head,10);
        printDDL(head);
    }
}
