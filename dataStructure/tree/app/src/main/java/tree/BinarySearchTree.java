package tree;

public class BinarySearchTree<T> extends BinaryTree{
    private int nodeCount;

    public int getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(int nodeCount) {
        this.nodeCount = nodeCount;
    }

        public void Add(Integer Key){
        Node node=new Node(Key);
        if(root==null) {
            root = node;
            return;
        }
        Node prev=null;
        Node temp=root;
        while (temp!=null){
            if((Integer)temp.value>Key){
                prev=temp;
                temp=temp.left;
            }
            else if ((Integer)temp.value<Key){
                prev=temp;
                temp=temp.right;
            }
        }
        if((Integer)prev.value>Key)
            prev.left=node;
        else prev.right=node;
    }
    public boolean contains(int key) {
        return compare(root, key);
    }

    private boolean compare(Node current, Integer key) {
        if (current == null) {
            return false;
        } else if (current.value == key) {
            return true;
        } else if ((Integer)current.value > key) {
            return compare(current.left, key);
        } else if ((Integer)root.value < key) {
            return compare(current.right, key);
        }else {
            return false;
        }
    }

    private void traverse(Node current, int key) {
        if (key > (int)current.value) {
            if (current.right == null) {
                current.right=new Node(key);
                nodeCount++;
                return;
            }
            current = current.right;
        } else {
            if (current.left == null) {
                current.left=new Node(key);
                nodeCount++;
                return;
            }
            current = current.left;
        }
        traverse(current, key);
    }

}
