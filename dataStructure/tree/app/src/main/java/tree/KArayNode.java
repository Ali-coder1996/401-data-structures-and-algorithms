package tree;

import java.util.ArrayList;

public class KArayNode {
    private ArrayList<KArayNode> children;
    private String key;
    private int maxNrOfChildren;

    public KArayNode(String key, int maxNrOfChildren) {
        this.key = key;
        this.maxNrOfChildren = maxNrOfChildren;
        this.children = new ArrayList<>();
    }

    public ArrayList<KArayNode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<KArayNode> children) {
        this.children = children;
    }

    public void addChild(KArayNode child) {
        this.children.add(child);
    }

    public int getMaxNrOfChildren() {
        return maxNrOfChildren;
    }

    public String getKey() {
        return key;
    }
}
