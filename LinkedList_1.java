public class LinkedList_1 {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            next = null;
        }
    }
    //add an element in linked list
    Node head;
    Node curr;
    Node temp;

    void add (int data){
        temp = new Node(data);
        if(head==null){
            head = temp;
            curr =head;
        }
        curr.next = temp;
        curr=curr.next;
    }
    void remove(){// going to remove from last only
        temp = head;
        if(head==null || temp.next==null){
            System.out.println("Linked list is empty...");
            return;
        }
        else if(temp.next.next==null){
            temp.next=null;
            return;
        }
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    void printit(){
        temp =head;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }
    }
}
