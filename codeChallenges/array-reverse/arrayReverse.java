import java.util.Arrays;

public class arrayReverse {
    public static void main(String[] args) {
        int[] evenArray= {6,5,4,3,2,1};
        int[] oddArray={7,6,5,4,3,2,1};
        int[] emptyArray={};
        System.out.println(Arrays.toString(reverseArray(evenArray)));
        System.out.println(Arrays.toString(reverseArray(oddArray)));
        System.out.println(Arrays.toString(reverseArray(emptyArray)));
    }
    public static int[] reverseArray(int[] arr){
        int[] newArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[arr.length-1-i];
        }
        return newArray;
    }
}