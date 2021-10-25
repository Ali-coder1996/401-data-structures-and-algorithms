package stack.and.queue;

public class Stack<T> {
    Node<T> top;
    private int size = 0;

    public Stack() {
        this.top = null;
    }

    //push a new node to the stack
    public void push(T value){
        Node newNode=new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    //pop from the stack
    public <T> T pop(){
        if (top ==null){
            return null;
        }
        T value= (T) top.value;
        try {
            Node current=top;
            top=top.next;
            current.next=null;
        }catch (NullPointerException e) {
            System.out.println("Exception: Can't Pop from Empty Stack (*_*)");
        }
        size--;
        return value;
    }

    //peek method return value of the top
    public <T> T peek(){
        T value = null;
        try {
            value = (T)top.value;
        } catch (NullPointerException e) {
            System.out.println("Exception: Can't peek from Empty Stack (*_*) ");
        }
        return value;
    }

    //check of the stack isEmpty
    public boolean isEmpty(){
        return top == null;
    }
    //toString for the stack
    //"TOP of Stack -> { d } -> { c } -> { b } -> { a } -> Null"
    @Override
    public String toString() {
        String stackToString = "TOP of Stack -> ";
            Node current = top;
            while (current != null) {
                stackToString += "{ " + current.value + " } -> ";
                current = current.next;
            }
        return stackToString + "{ Null }";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
