/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import java.util.HashMap;
import java.util.Objects;

public class App {
    private static final String PATTERN = "\\W+";


    public static void main(String[] args) {

        System.out.println(repeatedWordsFrequently("Once upon a time, there was a brave princess who..."));
        System.out.println(repeatedWordsFrequently("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."	));
        System.out.println(repeatedWordsFrequently("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."	));
        System.out.println(repeatedWordsFrequently(""));

        HashTable<Integer,String> hashTable = new HashTable<>();

        System.out.println(hashTable.getSize());
        System.out.println(hashTable.isEmpty());

        hashTable.add(7,"Ali");
        hashTable.add(5,"Ahmad");
        hashTable.add(3,"Emam");

        System.out.println(hashTable.isEmpty());

        System.out.println(hashTable.getSize());

        System.out.println(hashTable.get(5));

        System.out.println(hashTable.contains(7));
        System.out.println(hashTable.contains(9));
    }
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
}
