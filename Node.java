package homework;

//My Node Class
public class Node<T extends Comparable> {
    T value;
    Node<T> next;

    public Node(){
        this.value=null;
        this.next=null;
    }

    public Node(T value){
        this.value=value;
        next=null;
    }

    public Node<T> createNode(T value){
        return new Node<T>(value);
    }

    @Override
    public String toString() {
        return "value= " + value + ", next= " + next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
