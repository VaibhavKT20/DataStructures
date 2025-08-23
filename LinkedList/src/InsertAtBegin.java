public class InsertAtBegin {
    public static Node insertAtBegin(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        return temp;
    }
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-> ");
            curr= curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertAtBegin(head,10);
        head=insertAtBegin(head,20);
        head=insertAtBegin(head,30);
        head=insertAtBegin(head,40);
        printList(head);
    }
}
