package tree;

public class Tree<T> {
    public KArayNode root;
    public Tree(T value,int maxNrOfChildren) {

        this.root = new KArayNode(value);
    }

    public Tree() {
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
