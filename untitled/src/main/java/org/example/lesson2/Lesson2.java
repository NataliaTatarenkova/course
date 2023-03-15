package main.java.org.example.lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        int[] arr = new int[]{2,6,9,5,-9,0,8,3,4,5, 0,0,0,-9,-8};
        //int[] resut = sortChoice(arr);
        //int[] resut = sortBubble(arr);
        /*int[] resut = task3(arr, -9);
        for (int i = 0; i < resut.length; i++) {
            System.out.println(resut[i]);
        }*/
        System.out.println("min = " + min(arr));
        System.out.println("max = " + max(arr));

        int[] dd = new int[]{2,2,5, 8};
        System.out.println("avg = " + avg(dd));
    }

    public static double avg(int[] arr) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++){
            avg = avg + arr[i];
        }
        return avg / arr.length;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] task3(int[] arr, int delete) {
        int[] returnArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=delete){
                returnArr[index] = arr[i];
                index++;
            }
        }
        int[] returnArr1 = new int[index];
        for (int i = 0; i < returnArr1.length; i++){
            returnArr1[i] = returnArr[i];
        }
        return returnArr1;
    }

    public static int[] sortBubble(int[] arr) {
        boolean exit = true;
        while (exit){
            exit = false;
            for (int i = 0; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]) {
                    int change = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = change;
                    exit = true;
                }
            }
        }
        return arr;
    }

    public static int[] sortChoice(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int indexChange = i;
            for (int k = i; k < arr.length; k++) {
                if (value > arr[k]){
                    value = arr[k];
                    indexChange = k;
                }
            }
            arr[indexChange] = arr[i];
            arr[i] = value;
        }
        return arr;
    }

}
