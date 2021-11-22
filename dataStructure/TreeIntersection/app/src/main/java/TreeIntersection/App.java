/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TreeIntersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {

    public static void main(String[] args) {
        BinarySearchTree firstBinaryTree =new BinarySearchTree();
        firstBinaryTree.root=new Node(8);
        firstBinaryTree.Add(3);
        firstBinaryTree.Add(10);
        firstBinaryTree.Add(1);
        firstBinaryTree.Add(6);
        firstBinaryTree.Add(14);
        firstBinaryTree.Add(4);
        firstBinaryTree.Add(7);
        firstBinaryTree.Add(13);


        BinarySearchTree secondBinaryTree =new BinarySearchTree();
        secondBinaryTree.root=new Node(20);
        secondBinaryTree.Add(5);
        secondBinaryTree.Add(300);
        secondBinaryTree.Add(50);
        secondBinaryTree.Add(115);
        secondBinaryTree.Add(10);
        secondBinaryTree.Add(14);


        System.out.println(treeIntersection(firstBinaryTree, secondBinaryTree));

    }

    public static List<Integer> treeIntersection(BinarySearchTree firstBinaryTree,
                                                 BinarySearchTree secondBinaryTree) {
        List<Integer> repeatedValues = new ArrayList<>();

        List<Integer> firstBinaryTreeElements = firstBinaryTree.breadthFirst(firstBinaryTree);
        List<Integer> secondBinaryTreeElements = firstBinaryTree.breadthFirst(secondBinaryTree);

        HashTable<Integer, Integer> hashMap = new HashTable<>();
        int previousSize;

        for (int element : firstBinaryTreeElements) {
            hashMap.add(element, element);
        }

        previousSize = hashMap.getSize();

        for (int element : secondBinaryTreeElements) {
            hashMap.add(element, element);
            if (previousSize == hashMap.getSize()) {
                repeatedValues.add(element);
            }
            previousSize = hashMap.getSize();
        }

        return repeatedValues;
    }
}
