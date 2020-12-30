import Sorting.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[11];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i;
        }


        InsertElement.insertElement(arr, 8, 6);

        System.out.println(Arrays.toString(arr));

    }
}
