public class InsertAtBegin {
    public static Node insertAtBegin(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
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
        return head;
    }
    public static Node insertAtPos(Node head,int pos,int data){
        Node temp=new Node(data);
        if(head==null){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i=1;i<=pos-2 && curr!=null ;i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static Node deleteHead(Node head){
        if(head==null){
            return null;
        }
        return head.next;
    }
    public static Node deleteAtEnd(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
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
        head=insertAtEnd(head,90);
        head=insertAtEnd(head,110);
        printList(head);
        head=insertAtPos(head,4,999);
        printList(head);
        head=deleteHead(head);
        printList(head);
        head=deleteAtEnd(head);
        printList(head);
    }
}

