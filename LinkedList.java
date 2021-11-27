package homework;

//My Linked List Class
public class LinkedList<T extends Comparable>{
    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void addNode(T value)
    {
        Node<T> newNode = new Node<T>(value);
        // if head is null assign new node as head
        if (head == null)
        {
        	head = newNode;
        }
        else
        {
            // continue until next node is null,
            // when next node is null here is the place that you will insert node
            // Head->Node2->Node3->null
            //                       |
            // -------------------CurrentNode----------------
            // then
            // Head->Node2->Node3->CurrentNode
        	// If you want you can use iterators
        	Node<T> currentNode = head.next;
        	while(currentNode.next != null)
        	{
        		currentNode = currentNode.next;
        	}
        	currentNode.next = newNode;
        }
    }

    //Delete the student whose id is entered by the user.
    public void deleteNode(T value){
        if(head.value.compareTo(value)==0){
            head=head.next;
            System.out.printf("Student has been deleted.");
        }else{
            Node<T> iterator , previous;
            iterator=previous=head;
            while(iterator.next!=null){
                previous=iterator;
                iterator=iterator.next;
                if (iterator.value.compareTo(value)==0){
                    previous.next=iterator.next;
                }
            }
            System.out.printf("Student has been deleted.");
        }

    }
    
    public int count(){
        int count=0;
        Node<T> iterator=head;
        while(iterator!=null){
            iterator=iterator.next;
            ++count;
        }
        return count;
    }

    public void display(){
        Node<T> iterator = head;
        while(head.next!=null){
            System.out.println(iterator);
            iterator=iterator.next;
        }
    }

}
