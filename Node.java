package homework;

//Node Class
public class Node<T extends Comparable> {
    public T value;
    public Node<T> next;

    public Node(T value){
        this.value=value;
        next=null;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

}
