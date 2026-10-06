// Implementing linked list

public class LL {

    private Node head;  // defining a head node
    private int size; // defining size of linked list

    LL(){  // initializing size as zero inside constructor
        this.size=0;
    }

    class Node{
    String data; // Data to be stored at a node
    Node next; // we mada a same data type which will be pointing to the next node

    Node(String data){  // Constructor for node class
        this.data=data;
        this.next=null;
        size ++;    // increment size when new node is created

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
        while(currNode.next != null){ // Trav
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

    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return ;
        }
        size --; // decrement when node deleted
        head=head.next; // make the second node as the head
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return ;
        }

        size --;   // decrement when node deleted

        if(head.next==null){ // handle edge case when linked list have only one element
            head=null;
            return ;
        }

        Node secondLast=head;
        Node last=head.next;

        while(last.next != null){
            secondLast=secondLast.next;
            last=last.next;
        }

        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }

    public void reverseList(){
        if(head==null || head.next==null){
            return ;
        }

        Node prevNode=head;
        Node currNode=head.next;

        while (currNode != null) {
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
            
        }

        head.next=null;
        head=prevNode;

    }

    public Node reverseListRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead=reverseListRecursive(head.next);
        head.next.next=head;
        head=null;

        return newHead;

    }

    }

    public static void main(String[] args) {
        LL list=new LL();
    }
}

