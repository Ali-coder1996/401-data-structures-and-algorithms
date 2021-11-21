# Hashtable

A hash table data structure was created from the ground up.

## Challenge

implementation from scratch

## Approach & Efficiency

add: incorporates both the key and the value.

get: returns the value from the table based on the key.

hashCode: returns an index in the collection based on an arbitrary key.

contains: returns the boolean (True / False) from the table based on the key.

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

'repeatedWords' Big o (n^2) time complexity 

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