# Hashtable

A hash table data structure was created from the ground up.

## code Challenge 30

implementation from scratch

## Approach & Efficiency

* `hash(K key)`
    * T: O(1) there is no loop
    * S: O(1) constant complexity – takes the same amount of space regardless of the input size
* `add(K key, V value)`
    * T: O(n) worst case : O(n) "when the all keys is hashed to the same index."
    * S: O(n) where n is the size of the array of buckets.
* `get(K key)`
    * T: O(1) there is no loop
    * S: O(1) constant complexity – takes the same amount of space regardless of the input size
* `contains(K key)`
    * T: O(1) there is no loop
    * S: O(1) constant complexity – takes the same amount of space regardless of the input size

## API

`add()` incorporates both the key and the value.

`get()` returns the value from the table based on the key.

`hashCode()` returns an index in the collection based on an arbitrary key.

`isEmpty()` check to see if the hash table is empty or not.

`contains()` returns the boolean (True / False) from the table based on the key.


## code challenge 31

# Challenge Summary

Write a function called repeated word that finds the first word to occur more than once in a string

## Challenge

In this challenge we create write a function repeatedWord that finds the first word to occur more than once in a string.

## Approach & Efficiency

'repeatedWords' Big o (n^2) time complexity  This can happen when we need to nest loops together to compare

## Solution

~~~java
        public static String repeatedWordsFrequently(String str) {
        int count;
        HashMap<String, Integer> temp = new HashMap<>();
        String[] words = str.toLowerCase().split(PATTERN);

        for (int i = 0; i < words.length; i++) {
        count = 1;
        for (int j = i + 1; j < words.length; j++) {
        if (words[i].equals(words[j])) {
        count++;
        words[j] = "0";
        }
        }
        if (count > 1 && !Objects.equals(words[i], "0")) {
        temp.put(words[i], count);
        }
        }
        return temp.toString();
        }
~~~