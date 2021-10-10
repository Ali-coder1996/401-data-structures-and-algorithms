# arrayReverse

```java

    public static int[] reverseArray(int[] arr){
        int[] newArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[arr.length-1-i];
        }
        return newArray;
    }
```