package Sorting;

public class BubbleSort<T extends Comparable<? super T>> {
        //O(n*n)
        public  T[] bubbleSort(T[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].compareTo(arr[j]) > 0) {
                        T temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr;
        }
}

