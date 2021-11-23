# Challenge Summary

Create a HashMapTreeIntersection function that accepts two binary Search tree inputs. 
Return a HashMap of the values discovered in both trees without using any of your language's built-in library functions.
## Whiteboard Process

![](whiteboard.png)

## Approach & Efficiency

The Big O space is O(n), and the time is O(n).


## Solution

~~~java
    public static List<Integer> treeIntersection(BinaryTree firstBinaryTree,
        BinaryTree secondBinaryTree) {
        List<Integer> repeatedValues = new ArrayList<>();
        List<Integer> firstBinaryTreeElements = firstBinaryTree.breadthFirst(firstBinaryTree);
        List<Integer> secondBinaryTreeElements = firstBinaryTree.breadthFirst(secondBinaryTree);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int previousSize;

        for (int element:firstBinaryTreeElements){
        hashMap.add(element,element);
        }

        previousSize = hashMap.getSize();

        for (int element:secondBinaryTreeElements){
        hashMap.add(element,element);
        if (previousSize == hashMap.getSize()){
        repeatedValues.add(element);
        }
        previousSize = hashMap.getSize();
        }

        return repeatedValues;
        }
~~~


## code challenge 33

# Challenge Summary

Create tests for a happy situation, a scenario where no matches exist, cases where either table is
empty, and any additional edge cases at the very least. Create a new Hashmap with the common key as
the key and an array as the value to store the first table's value as the first element and the
second table's value as the second element. Iterate over the first table's keys. Grab the value of a
corresponding key in the second Hashmaps. Create an array in which the values from each table are
stored. In the new Hashmap, save that array with the key. Return the newly created List.

## Whiteboard Process

![](whiteboardcode33.png)

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

The Big O space is O(n), and the time is O(n).