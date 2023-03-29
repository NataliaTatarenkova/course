package main.java.org.example.lesson4;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        /*int[] result = sortMerge(new int[]{8,2,7,6,0, 9,-9,-9,-9});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }*/
        System.out.println(anagram("пила", "липа"));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (index1 == arr1.length){
                result[i] = arr2[index2];
                index2++;
            } else if (index2 == arr2.length) {
                result[i] = arr1[index1];
                index1++;
            } else if (arr1[index1] <= arr2[index2]){
                result[i] =  arr1[index1];
                index1++;
            } else if (arr1[index1] > arr2[index2]) {
                result[i] = arr2[index2];
                index2++;
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

    public static boolean anagram(String s1, String s2){
        if (s1.length()!=s2.length()) {
            return false;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
