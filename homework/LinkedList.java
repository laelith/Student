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

    public Node<T> createNode(T value){
        return new Node<T>(value);
    }

    //
    public void addNode(T value){
        Node<T> newNode = createNode(value);
        newNode.next=head;
        head=newNode;
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

    //Shows the student number
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
