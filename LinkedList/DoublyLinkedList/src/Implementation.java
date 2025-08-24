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
    public static Node insertAtEnd(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            return temp;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
    }

    public static Node reverseDLL(Node head){
        if(head==null ||head.next==null) return head;
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
    public static Node deleteAtHead(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        else{
            head=head.next;
            head.prev=null;
            return head;
        }
    }
    public static Node deleteAtEnd(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
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
        head=insertAtBegin(head,5);
        printDDL(head);
        head=insertAtEnd(head,20);
        head=insertAtEnd(head,30);
        printDDL(head);
//        head=reverseDLL(head);
//        printDDL(head);
        head=deleteAtHead(head);
        printDDL(head);
        head=deleteAtEnd(head);
        printDDL(head);
    }
}
