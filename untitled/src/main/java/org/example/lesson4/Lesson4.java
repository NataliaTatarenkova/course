package main.java.org.example.lesson4;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        int[] result = sortMerge(new int[]{8,2,7,6,0});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] <= arr2[j]) {
                    result[index] = arr1[i];
                    index++;
                    if ( j == arr2.length-1){
                        result[index] = arr2[j];
                        index++;
                    }
                    break;
                } else {
                    result[index] = arr2[j];
                    index++;
                    if ( j == arr2.length-1){
                        result[index] = arr1[i];
                        index++;
                    }
                }
            }

        }
        return result;
    }

    public static int[] sortMerge(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int indexMid = arr.length / 2;
        int[] arr1 = new int[indexMid];
        int[] arr2 = new int[arr.length%2 == 0 ? indexMid : indexMid + 1];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < indexMid) {
                arr1[i] = arr[i];
            } else {
                arr2[newIndex] = arr[i];
                newIndex++;
            }
        }
        int[] result = merge(sortMerge(arr1), sortMerge(arr2));
        return result;
    }

    public static boolean anagram(int[] arr1, int[] arr2){
        return true;
    }
}
