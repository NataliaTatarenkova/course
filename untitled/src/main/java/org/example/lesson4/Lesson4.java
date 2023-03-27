package main.java.org.example.lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        int[] result = new int[]{2,4,6,7};

    }

    public static int[] merge(int i, int j) {
        int[] result = new int[2];
        if ( i> j) {
            result[0] = i;
            result[1] = j;
        }
        if ( i <= j) {
            result[0] = j;
            result[1] = i;
        }
        return result;
    }

   /* public static int[] sortMerge(int[] arr) {
        if (arr.length > 2) {
            return merge(arr[0], arr[1]);
        }
        int indexMid = arr.length/2;
        int[] arr1 = new int[indexMid];
        int[] arr2 = new int[indexMid];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < indexMid){
                arr1[i] = arr[i];
            } else {
                arr2[newIndex] = arr[i];
                newIndex++;
            }
        }
        sortMerge(arr1);
        sortMerge(arr2);
    }*/

    public static boolean anagram(int[] arr1, int[] arr2){
        return true;
    }
}
