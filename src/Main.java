import Sorting.BubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BubbleSort<Character> sort = new BubbleSort<>();
        System.out.println(Arrays.toString(sort.bubbleSort(new Character[]{'c', 'd', 'a', 'b'})));
    }

}
