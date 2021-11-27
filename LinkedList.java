package homework;

//My Linked List Class
public class LinkedList <T extends Comparable> {
    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> createNode(T value){
        return new Node<T>(value);
    }

    public void addNode(T value) {
        Node<T> newNode = new Node<T>(value);
        // if head is null assign new node as head
        if (head == null){
        	head = newNode;
        }else{
        	Node<T> iterator = head;
            while(iterator.next!=null){
                iterator=iterator.next;
            }
            iterator.next=newNode;
        }
    }

    public void addNotetoFront(T value){
        Node<T> newNode = createNode(value);
        newNode.next=head;
        head=newNode;
    }

    public void deleteNode(T value){
        if(head.value.compareTo(value)==0){
            head=head.next;
            System.out.printf(value.getClass() + " has been deleted.");
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
            System.out.printf(value.getClass() + " has been deleted.");
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
        while(iterator!=null){
            System.out.println(iterator.value);
            iterator=iterator.next;
        }
    }
}
