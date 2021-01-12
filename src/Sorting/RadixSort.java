package Sorting;

import java.util.Arrays;

public class RadixSort {


    public static int[] radixSort(int[]arr) {
        int max = getMax(arr);

        int[] result = new int[arr.length];

        for (int pos = 1; max/pos > 0; pos *= 10) {
            result = countSort(arr, pos);
        }

        return result;
    }


    private static int[] countSort(int[]arr, int pos){
        int[] count = new int[10];
        for (int i = 0; i <count.length ; i++) {
            count[i] = 0;
        }
        int[] result = new int[arr.length];


        for (int i = 0; i < arr.length ; i++) {
            ++count[(arr[i] / pos) % 10];
        }

        for (int i = 1; i < 10 ; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = arr.length - 1; i >=0 ; i--) {
             result[--count[(arr[i] / pos) % 10]] = arr[i];
        }

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = result[i];
        }

        return arr;
    }


    private static int getMax(int[]arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
