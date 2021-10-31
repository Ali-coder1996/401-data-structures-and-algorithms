package tree;

public class BinarySearchTree<T> extends BinaryTree{
    private int nodeCount;
    Integer max =null;
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
    public int maximum() throws Exception {
        //handling empty tree situation
        if (root == null) {
            throw new Exception("Exception: Empty tree *_*");
        }
        Node currentNode = root;
        max = (Integer) currentNode.value;

        if (currentNode.left != null) {
            traverse(currentNode.left); // traverse left sub tree
        }
        if (currentNode.right != null) {
            traverse(currentNode.right); // traverse right sub tree
        }
        return max;
    }

    /**
     * traverse sub tree and find the max number
     *
     * @param node: the root of the sub tree
     */
    private void traverse(Node node) {
        if ((Integer)node.value > max) {
            max = (Integer) node.value;
        }
        if (node.left != null) {
            traverse(node.left); // traverse left sub tree
        }
        if (node.right != null) {
            traverse(node.right); // traverse right sub tree
        }
    }

}
