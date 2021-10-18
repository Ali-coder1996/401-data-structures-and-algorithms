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
        if(current ==null){
            head=node;
            return;
        }
        while (current.next != null){
            current = current.next;
        }
        current.next=node;
    }

    // add a node after specific node
    public void insertAfter(T value ,T newValue){
        Node current =head;
        Node node =new Node(newValue);
        if (current ==null){
            head=node;
            return;
        }
        while (current != null){
            if (current.value.equals(value)){
                node.next=current.next;
                current.next=node;
            }
            current=current.next;
        }
    }

    //add a node before specific value
    public void insertBefore(T beforeNodeValue, T newNodeValue) {
        Node newNode = new Node(newNodeValue);
        if (head == null) {
            head = newNode;
        } else if (head.value.equals(beforeNodeValue)) {
            insert(newNodeValue);
        } else {
            Node beforeNode = head;
            Node currentNode = head.next;
            while (!currentNode.value.equals(beforeNodeValue)) {
                beforeNode = beforeNode.next;
                currentNode = currentNode.next;
            }
            newNode.next=beforeNode.next;
            beforeNode.next=newNode;
        }
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
    public void deleteNodeByKey(T key) {
        // Store head node
        Node current = head;
        Node prev = null;

        // If head node itself holds the key to be deleted
        if (current != null && current.value == key) {
            head = current.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (current != null && current.value != key) {
            prev = current;
            current = current.next;
        }

        // If key was not present in linked list
        if (current == null)
            return;

        // Unlink the node from linked list
        prev.next = current.next;
    }

//     public void deleteNodeByPosition(int position) {
//        // If linked list is empty
//        if (head == null)
//            return;
//
//        // Store head node
//        Node current = head;
//        // If head needs to be removed
//        if (position == 0)
//        {
//            head = current.next;   // Change head
//            return;
//        }
//
//        // Find previous node of the node to be deleted
//        for (int i=0; current!=null && i<position-1; i++)
//            current = current.next;
//        // If position is more than number of nodes
//        if (current == null || current.next == null)
//            return;
//
//        // Node temp->next is the node to be deleted
//        // Store pointer to the next of node to be deleted
//        Node next = current.next.next;
//
//        current.next = next;  // Unlink the deleted node from list
//    }
//    public int getCount(){
//        Node current =head;
//        int count=0;
//        if (head == null)
//            return count;
//        while (current !=null){
//            current=current.next;
//            count++;
//        }
//        return count;
//    }
//    public int GetNth(int index){
//        Node current =head;
//        if (current == null)
//            return -1;
//        for(int i=0; current !=null && i< index;i++){
//            current=current.next;
//        }
//        return (int)current.value;
//    }
//    public int printMiddle(){
//        Node current =head;
//        if(current ==null)
//            return -1;
//        for (int i=0; current !=null && i<getCount()/2;i++)
//            current=current.next;
//        return (int)current.value;
//    }
}
