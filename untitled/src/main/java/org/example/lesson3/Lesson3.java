package main.java.org.example.lesson3;

public class Lesson3 {
    public static void main(String[] args) {

        //int[] resutSort = binarySort1(new int[]{6,4,9,1,8});
        // for (int i = 0; i < resutSort.length; i++){
        //    System.out.println(resutSort[i]);
        //}
        int[] resutSort = new int[]{1,2,3,4,9,17,20,96};
        System.out.println(binarySearch(resutSort, -20, 0, resutSort.length));
    }
    public static int binarySearch(int[] arr, int search, int start, int finish){
        if (start == finish){
            return -1;
        }
        int midIndex = (start+finish)/2;
        int midValue = arr[midIndex];

        if (midValue > search) {
            return binarySearch(arr, search, start, midIndex);
        }
        if (midValue < search) {
            return binarySearch(arr, search, midIndex, finish);
        }
        return midIndex+1;
    }

    //Работает
    public static int[] binarySort1(int[] arr){
        if (arr.length <= 1){
            return arr;
        }
        int firtValue = arr[0];
        int[] rightArr = new int[arr.length];
        int[] leftArr = new int[arr.length];
        int indexLeft = 0;
        int indexRight = 0;
        for (int i = 0; i < arr.length; i++) {
            if (firtValue < arr[i]) {
                leftArr[indexLeft] = arr[i];
                indexLeft++;
            }
            if (firtValue > arr[i]) {
                rightArr[indexRight] = arr[i];
                indexRight++;
            }
        }
        int[] rightArr1 = new int[indexRight];
        int[] leftArr1 = new int[indexLeft];
        for (int i = 0; i < rightArr1.length; i++) {
            rightArr1[i] = rightArr[i];
        }

        for (int i = 0; i < leftArr1.length; i++) {
            leftArr1[i] = leftArr[i];
        }
        int[] result = new int[leftArr1.length+rightArr1.length+1];
        int[] leftResult = binarySort1(leftArr1);
        int[] rightResult = binarySort1(rightArr1);
        int indexResult = 0;
        for (int i = 0; i < leftResult.length; i++) {
            result[indexResult] = leftResult[i];
            indexResult++;
        }
        result[indexResult] = firtValue;
        indexResult++;
        for (int i = 0; i < rightResult.length; i++) {
            result[indexResult] = rightResult[i];
            indexResult++;
        }
        return result;
    }
}
