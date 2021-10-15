package linkedList;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList(){
        this.head=null;
    }

    // add a new node at the beginning of the head
    public void insert(T value){
        Node node =new Node(value);
        node.next=head;
        head=node;
    }

    //add a new node to the end of the LinedList
    public void append(T value){
        Node node =new Node(value);
        Node current =head;
        while (current.next != null){
            current = current.next;
        }
        current.next=node;
    }

    // check if they LikedList has a specific value
    public boolean include(T value){
        Node current = head;
        while (current != null){
            if (current.value.equals(value))
                return true;
            current=current.next;
        }
        return false;
    }

    //"{ a } -> { b } -> { c } -> NULL"
    @Override
    public String toString() {
        Node current =head;
        String result= "";
        while (current != null){
            result += "{ "+current.value+" } -> ";
            current = current.next;
        }
        return result + "Null";
    }
}
