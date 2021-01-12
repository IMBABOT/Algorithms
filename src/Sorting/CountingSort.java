package Sorting;

import java.util.Arrays;

public class CountingSort {

    public static int[] countingSort(int[] arr){
        int max = arr[0];
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max ; i++) {
            count[i] = count[i] + count[i-1];
        }

        for (int i = arr.length - 1; i >= 0 ; i--) {
            array[--count[arr[i]]] = arr[i];
        }

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = array[i];
        }

        return arr;
    }
}
