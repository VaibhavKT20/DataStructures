public class SearchLL {
    public static int searchLL(Node head,int x){
        int pos=1;
        Node curr=head;
        while(curr!=null){
            if(curr.data==x){
                return pos;
            }
            pos++;
            curr=curr.next;
        }
        return -1;
    }
    public static int recursiveSearchLL(Node head,int x){
        if(head==null){
            return -1;
        }
        if(head.data==x){
            return 1;
        }
        else{
            int res=recursiveSearchLL(head.next,x);
            if(res==-1) return -1;
            else{
                return res+1;
            }
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(80);
        int x=30;
        int result=searchLL(head,x);
        if(result!=-1){
            System.out.println(x+" Found at position "+result);
        }

        int result1=recursiveSearchLL(head,x);
        System.out.println(x+" Found at position "+result1);
    }
}
