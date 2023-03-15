package main.java.org.example.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        int [] arr =new int[]{55,67,89,99};
        /*System.out.println(binarySearchRight(arr, 55));
        System.out.println(binarySearchRight(arr, 67));
        System.out.println(binarySearchRight(arr, 89));
        System.out.println(binarySearchRight(arr, 99));
        System.out.println(binarySearchRight(arr, -55));
        ///////////////////////////////////////////////
        System.out.println(lineSearch(arr, 55));
        System.out.println(lineSearch(arr, 67));
        System.out.println(lineSearch(arr, 89));
        System.out.println(lineSearch(arr, 99));
        System.out.println(lineSearch(arr, -55));*/
        int[] in = task3(new int[]{1,2,3,4}, new int[]{5,6,7,8,1,2,2,3,4});
        for (int i = 0;i<in.length; i++){
            System.out.println(in[i]);
        }
    }

    static int lineSearch(int[] arr, int search) {
        for(int i = 0; i < arr.length; i++){
            if(search == arr[i]){
                return i+1;
            }
        }
        return -1;
    }

    static int binarySearchRight(int[] arr, int search) {

        int first = 0;
        int last = arr.length;

        while (last != first) {
            int midIndex = (last + first) / 2;
            int midValue = arr[midIndex];
            if (midValue == search) {
                return midIndex+1;
            }
            if (midValue > search) {
                last = midIndex;
            }
            if (midValue < search) {
                first = midIndex;
            }
        }
        return -1;
    }
    static int[] task3(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length > arr1.length? arr1.length:arr2.length];
        int indexResualt = 0;
        boolean check = true;
        int index2 = 0;
        int index = 0;
        while (index < arr1.length) {
            int value = arr1[index];
            int value2 = arr2[index2];
            if (value2 == value){
                check = false;
                index2 = arr2.length;
            } else {
                index2++;
            }

            if (index2 == arr2.length) {
                if (check) {
                    result[indexResualt] = value;
                    indexResualt++;
                }
                index++;
                index2 = 0;
                check = true;
            }
        }
        int[] resultTrue = new int[indexResualt];
        for (int i = 0; i < resultTrue.length; i++){
            resultTrue[i] = result[i];
        }
        return resultTrue;

    }
    static int[] task3V2(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length > arr1.length? arr1.length:arr2.length];
        boolean check;
        int indexResult = 0;
        for (int i = 0; i < arr1.length; i++){
            check = true;
            for (int k = 0; k < arr2.length; k++){
                if(arr1[i] == arr2[k]){
                    check = false;
                }
            }
            if(check){
                result[indexResult] = arr1[i];
                indexResult++;
            }
        }
        int[] resultTrue = new int[indexResult];
        for (int i = 0; i < resultTrue.length; i++){
            resultTrue[i] = result[i];
        }
        return resultTrue;

    }
    /*static int binarySearch(int[] arr, int search) {
        double mid = arr.length/2;
        double left = mid;
        double right = mid;

        int midValue = arr[(int) mid - 1];
        int count = 0;
        if (arr[0] == search){
            return 1;
        }
        while (midValue != search) {
            if (search < midValue) {
                right = mid;
            }
            else if (search > midValue) {
                left = mid;
            }
            if (midValue > search){
                if (count == 0){
                    left = 1;
                    count++;
                }
                mid = Math.ceil((right+left)/2);
                midValue = arr[(int) mid - 1];

                continue;
            }
            if (midValue < search){
                if (count == 0){
                    right = arr.length;
                    count++;
                }
                mid = Math.ceil((right+left)/2);
                midValue = arr[(int) mid - 1];
                continue;

            }
        }
        return (int)mid;
    }*/
}
