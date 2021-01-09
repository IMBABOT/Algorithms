import Sorting.BubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, -1, 10, 5, 8, 12, 34, 21, 12, 11, 10};
        BubbleSort<Integer> sort = new BubbleSort<>();
        sort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
