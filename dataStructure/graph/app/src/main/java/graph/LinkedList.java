package graph;

public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }
    public LinkedList insert(Object value){
        try{
            Node oldHead = this.head;
            this.head = new Node(value);
            if(oldHead != null) {
                this.head.next = oldHead;
            };
        }catch (Exception ex){
            System.out.println(ex);
        }
        return this;
    };


    public void append(Object val) {
        Node appendedNode = new Node(val);
        Node currentNode = head;
        if (head == null) {
            head = appendedNode;
        } else {
            while (currentNode.next != null) {

                currentNode = currentNode.next;
            }
            currentNode.next = appendedNode;
        }
    }

    @Override
    public String toString() {
        Node current = head;
        String result = "";
        while (current != null) {
            result += "{ " + current.val + " } -> ";
            current = current.next;
        }
        return result + "Null";
    }
}
