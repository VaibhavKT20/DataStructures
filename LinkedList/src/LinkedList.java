class Node1{
    int data;
    Node1 next;
    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node1 head;
    public void insertAtHead(int data){
        Node1 newNode=new Node1(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node1 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPos(int data,int pos){
        Node1 newNode=new Node1(data);
        if(pos==0){
            insertAtHead(data);
            return;
        }
        Node1 temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public void printLinkedList(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node1 temp=head;
        System.out.print("Linked List : ");
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtEnd(25);
        list.insertAtPos(15,2);
        list.insertAtPos(20,3);
        list.printLinkedList();
    }
}
