package stack.and.queue;

public class Queue<T>{
    Node<T> front;
    Node<T> rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    //enqueue into the queue
    public void enqueue(T value){
        Node newNode =new Node(value);
        if (isEmpty()){
            front=newNode;
        }else {
            rear.next=newNode;
        }
        size++;
        rear=newNode;
    }
    //dequeue from the queue
    public <T> T deQueue(){
        Node temp =front;
        front=front.next;
        temp.next=null;
        size--;
        return (T)temp.value;
    }

    //peek the queue
    public <T> T peek(){
        T value = null;
        try {
            value = (T)front.value;
        } catch (NullPointerException e) {
            System.out.println("Exception: Can't peek from Empty Stack (*_*) ");
        }
        return value;
    }

    @Override
    public String toString() {
        Node current = front;
        String result = "front -> ";
        while (current != null) {
            result += "{ " + current.value + " } -> ";
            current = current.next;
        }
        return result + "Null";
    }

    //check of the queue isEmpty
    public boolean isEmpty(){
        return front ==null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
