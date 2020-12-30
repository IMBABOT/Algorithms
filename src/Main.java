import Sorting.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

       MoveElementToFirstPlace.moveElementToFirstPlace(arr, 2);

        System.out.println(Arrays.toString(arr));
    }
}
