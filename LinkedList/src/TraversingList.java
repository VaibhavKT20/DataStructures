
public class TraversingList {
    public static void printList(Node head){
        Node curr=head;
        while(curr.next!=null){
            System.out.print(curr.data+"-> ");
            curr= curr.next;
        }
        System.out.println("NULL");
    }

    //Recursive approach for the traversing the list
    public static void rPrintList(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+"  ");
        rPrintList(head.next);

    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printList(head);
        rPrintList(head);
    }
}
