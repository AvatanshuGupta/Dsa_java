// Implementing linked list

public class LL {

    Node head;  // defining a head node
    private int size; // defining size of linked list

    class Node{
    String data; // Data to be stored at a node
    Node next; // we mada a same data type which will be pointing to the next node

    Node(String data){  // Constructor for node class
        this.data=data;
        this.next=null;

    }

    public void addFirst(String data){  // Add first function
        Node newNode=new Node(data);

        if(head==null){ // If head is null make the newNode as the head
            head=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){ // Add last function
        Node newNode=new Node(data);

        if(head==null){ // If head is null make the newNode as the head
            head=newNode;
            return ;
        }

        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void printList(){
        
        if(head==null){
            System.out.println("list is empty");
            return ;
        }

        Node currNode=head;
        while(currNode != null){
            System.out.println(currNode.data + "=>");
            currNode=currNode.next;
        }

        System.out.println("NULL");
    }

    }

    public static void main(String[] args) {
        
    }
}

