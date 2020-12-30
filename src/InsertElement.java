public class InsertElement {

    public static void insertElement(int[] arr, int element, int position){
        for (int i = arr.length - 2; i >= position - 1 ; i--) {
            arr[i + 1] = arr[i];
        }

        arr[position - 1] = element;
    }

}
