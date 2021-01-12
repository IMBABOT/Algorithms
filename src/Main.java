import Sorting.CountingSort;
import Sorting.HeapSort;
import Sorting.InsertionSort;
import Sorting.ShellSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,8,6,7};
        System.out.println(Arrays.toString(CountingSort.countingSort(arr)));
    }

}
