/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void instantiateAnEmptyTree(){
        BinaryTree binaryTree =new BinarySearchTree();

        assertNull(binaryTree.root);
    }
    @Test
    public void instantiateTreeWithSingleRootNode(){
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.Add(50);
        assertEquals(50,binarySearchTree.root.value);
    }
    @Test
    public void addLeftChildAndRightChildSingleRootNode(){
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.Add(50);
        binarySearchTree.Add(40);
        binarySearchTree.Add(60);
        assertEquals(50,binarySearchTree.root.value);
        assertEquals(60,binarySearchTree.root.right.value);
        assertEquals(40,binarySearchTree.root.left.value);
    }
    @Test
    public void ReturnCollectionFromPreorderTraversal(){
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.Add(50);
        binarySearchTree.Add(40);
        binarySearchTree.Add(60);
        List<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(40);
        arr.add(60);
        assertEquals(arr,binarySearchTree.preOrder(binarySearchTree.root));
    }
    @Test
    public void ReturnCollectionFromInorderTraversal(){
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.Add(50);
        binarySearchTree.Add(40);
        binarySearchTree.Add(60);
        List<Integer> arr = new ArrayList<>();
        arr.add(40);
        arr.add(50);
        arr.add(60);
        assertEquals(arr,binarySearchTree.inOrder(binarySearchTree.root));
    }
    @Test
    public void ReturnCollectionFromPostorderTraversal(){
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.Add(50);
        binarySearchTree.Add(40);
        binarySearchTree.Add(60);
        List<Integer> arr = new ArrayList<>();
        arr.add(40);
        arr.add(60);
        arr.add(50);
        assertEquals(arr,binarySearchTree.postOrder(binarySearchTree.root));
    }
    @Test
    public void ReturnMaxNumber() throws Exception {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.Add(50);
        binarySearchTree.Add(30);
        binarySearchTree.Add(20);
        binarySearchTree.Add(40);
        binarySearchTree.Add(70);
        binarySearchTree.Add(60);
        binarySearchTree.Add(80);
        assertEquals(80,binarySearchTree.maximum());
    }
    @Test
    public void breadthFirst()  {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.Add(50);
        binarySearchTree.Add(30);
        binarySearchTree.Add(20);
        binarySearchTree.Add(40);
        binarySearchTree.Add(70);
        binarySearchTree.Add(60);
        binarySearchTree.Add(80);
        assertEquals(List.of(50,30,70,20,40,60,80),binarySearchTree.breadthFirst(binarySearchTree));
    }
    @Test
    public void karyTree()  {
        KAryTree karyTree = new KAryTree();
        karyTree.addNode(new KArayNode("3", 3));
        assertEquals("Fizz",karyTree.fizzBuzzTree(karyTree.getRoot()).getRoot().getKey());
    }
    @Test
    public void karyTree1()  {
        KAryTree karyTree = new KAryTree();
        karyTree.addNode(new KArayNode("5", 3));
        assertEquals("Buzz",karyTree.fizzBuzzTree(karyTree.getRoot()).getRoot().getKey());
    }
    @Test
    public void karyTree2()  {
        KAryTree karyTree = new KAryTree();
        karyTree.addNode(new KArayNode("15", 3));
        assertEquals("FizzBuzz",karyTree.fizzBuzzTree(karyTree.getRoot()).getRoot().getKey());
    }
    @Test
    public void karyTree3()  {
        KAryTree karyTree = new KAryTree();
        karyTree.addNode(new KArayNode("2", 3));
        assertEquals("2",karyTree.fizzBuzzTree(karyTree.getRoot()).getRoot().getKey());
    }


}
