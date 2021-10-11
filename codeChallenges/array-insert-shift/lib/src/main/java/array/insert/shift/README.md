
# Array shift
~~~java
    public static int[] insertShiftArray(int[] arr,int value) {
        int[] newArray = new int[arr.length + 1];
        int index = arr.length % 2 == 0 ? arr.length / 2 : (arr.length + 1) / 2;
        newArray[index] = value;
        for (int i = 0; i < arr.length; i++) {
            if (i >= index) {
                newArray[i + 1] = arr[i];
            } else {
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }
~~~