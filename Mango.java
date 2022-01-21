import java.util.List;

public class Mango {
    
private ListNode  head;

public static class ListNode{

    private int data;
    private ListNode next;

    public ListNode(int data){
this. data=data;
this.next=null;
    }

}

public static void main(String[] args) {
    Mango obj = new Mango();
    obj.first_node(14);
    obj.first_node(14);
    obj.first_node(14);
    obj.display();
}


public void display(){
    ListNode current = head;
    while(current!=null){
        System.out.println(current.data);
        current = current.next;
    }
}
//insert a node at the beggining of the linked list
public void first_node(int value){

ListNode newnode = new ListNode(value);
newnode.next=head;
head=newnode;


}
}
