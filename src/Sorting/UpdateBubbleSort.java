package Sorting;

public class UpdateBubbleSort {

    public static int[] updateBubbleSort(int[] arr){

        for (int i = 0; i < arr.length -1 ; i++) {
               boolean isSorted = true;
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }
        return arr;
    }
}
