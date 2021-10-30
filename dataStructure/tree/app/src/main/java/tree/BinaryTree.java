package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    Node root;

    public BinaryTree(Node root) {
        this.root = null;
    }

    public BinaryTree() {
    }
    ArrayList<T> array= new ArrayList<>();

    public ArrayList<T> preOrder(Node tree){
        if (tree != null){
            array.add((T)tree.value);
            preOrder(tree.left);
            preOrder(tree.right);
        }
        return array;
    }
    public List<T> inOrder(Node tree){
        if (tree != null){
            inOrder(tree.left);
            array.add((T)tree.value);
            inOrder(tree.right);
        }
        return array;
    }
    public List<T> postOrder(Node tree){
        if (tree != null){
            postOrder(tree.left);
            preOrder(tree.right);
            array.add((T)tree.value);
        }
        return array;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
