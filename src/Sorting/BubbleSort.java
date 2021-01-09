package Sorting;

public class BubbleSort<T extends Comparable<? super T>> {
        //O(n*n)
        public  T[] bubbleSort(T[] arr) {
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j].compareTo(arr[j + 1]) > 0) {
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }
}

