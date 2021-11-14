package tree;

import java.util.ArrayList;

public class KArayNode {
    public ArrayList<KArayNode> children = new ArrayList<>();
    public Object value;

    public KArayNode(Object value) {
        this.value = value;
    }
    public KArayNode(Object value,ArrayList children) {
        this.value = value;
        this.children = children;
    }
    public KArayNode() {
    }

    @Override
    public String toString() {
        return
                "children=" + children +
                ", value=" + value +
                '}';
    }
}
