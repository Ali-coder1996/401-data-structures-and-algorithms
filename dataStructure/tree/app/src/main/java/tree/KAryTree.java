//package tree;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class KAryTree {
//    private KArayNode root;
//    private int maxNrOfChildren;
//
//    public KAryTree(KArayNode root) {
//        this.root = root;
//        this.maxNrOfChildren = root.getMaxNrOfChildren();
//    }
//
//    public KAryTree() {
//    }
//
//    public void setRoot(KArayNode root) {
//        this.root = root;
//    }
//
//    public KArayNode getRoot() {
//        return root;
//    }
//
//    public int getMaxNrOfChildren() {
//        return maxNrOfChildren;
//    }
//
//    public void addNode(KArayNode KAryNode) {
//
//        if (this.root == null) {
//            this.setRoot(KAryNode);
//        } else {
//            Queue<KArayNode> breadth = new Queue<>();
//            breadth.enqueue(this.getRoot());
//            while (breadth.peek() != null) {
//                KArayNode front = breadth.deQueue();
//                if (front.getChildren() != null) {
//                    for (KArayNode child : front.getChildren()) {
//                        breadth.enqueue(child);
//                    }
//                    if (front.getChildren().size() < front.getMaxNrOfChildren()) {
//                        front.addChild(KAryNode);
//                        return;
//                    }
//                } else {
//                    front.addChild(KAryNode);
//                    return;
//                }
//
//            }
//        }
//    }
//
//
//    public KAryTree fizzBuzzTree(KArayNode treeRoot) {
//
//        KAryTree KAryTree = new KAryTree();
//
//
//        Queue<KArayNode> breadth = new Queue<>();
//        breadth.enqueue(treeRoot);
//        while (breadth.peek() != null) {
//            KArayNode front = breadth.deQueue();
//            if (Integer.parseInt(front.getKey()) % 3 == 0 && Integer.parseInt(front.getKey()) % 5 == 0) {
//                KAryTree.addNode(new KArayNode("FizzBuzz", treeRoot.getMaxNrOfChildren()));
//            } else if (Integer.parseInt(front.getKey()) % 3 == 0) {
//                KAryTree.addNode(new KArayNode("Fizz", treeRoot.getMaxNrOfChildren()));
//            } else if (Integer.parseInt(front.getKey()) % 5 == 0) {
//                KAryTree.addNode(new KArayNode("Buzz", treeRoot.getMaxNrOfChildren()));
//            } else {
//                KAryTree.addNode(new KArayNode(front.getKey(), treeRoot.getMaxNrOfChildren()));
//            }
//        }
//        return KAryTree;
//    }
//}
