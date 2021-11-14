/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Class26;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] arr = {8, 4, 23, 42, 16, 15};
        int[] ReverseSorted = {20, 18, 12, 8, 5, -2};
        int[] arr1 = {5, 12, 7, 5, 5, 7};
        int[] arr2 = {2, 3, 5, 7, 13, 11};

        int[] newArr = InsertionSort(arr);
        int[] newArr1 = InsertionSort(ReverseSorted);
        int[] newArr2 = InsertionSort(arr1);
        int[] newArr3 = InsertionSort(arr2);

        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(newArr2));
        System.out.println(Arrays.toString(newArr3));
    }

    public static int[] InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
