import Sorting.HeapSort;
import Sorting.InsertionSort;
import Sorting.ShellSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 9, 10, 11, 3, 2, -35, -85, 85, 112};
        ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
