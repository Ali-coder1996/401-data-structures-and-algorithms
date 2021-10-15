/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package binarysearch;

import java.util.*;

public class App {

    public static void main(String[] args) {
        int[] binary = {0,1,2,3,6,5};
        int target = 8;
//        System.out.println(missingNumber(binary));
//        System.out.println(searchInsert(binary,8));
//        System.out.println(containsDuplicate(binary));
//        System.out.println(binarySearch(binary, target));
//        System.out.println(Arrays.toString(twoSum(binary,14)));
//        HashMap<Integer,Integer>me =new HashMap<>();
//        me.put(1,5);
//        System.out.println(me.get(1));
    }

    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map1 = new HashMap<>();
//
//        for (int i = 0 ; i < nums.length; i++) {
//            if (map1.get(target-nums[i]) != null) {
//                return new int[]{map1.get(target-nums[i]), i};
//            }
//            map1.put(nums[i], i);
//        }
//
//        return null;
//    }
//    public static int searchInsert(int[] nums, int target) {
//        for (int i=0;i<nums.length;i++){
//            if(nums[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for(int num : nums) {
//            if(!set.add(num)) {
//                return true;
//            }
//        }
//        return false;
//    }
//public static int missingNumber(int[] nums) {
//    int arraySum = 0;
//    int sum = 0;
//
//    for(int i = 0; i < nums.length; i++){
//        sum += i+1;
//        arraySum += nums[i];
//    }
//
//    return sum - arraySum;
//}
}
