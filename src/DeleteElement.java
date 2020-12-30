public class DeleteElement {


    public static int deleteElement(int[] arr, int position){
        int temp = arr[position];
        for (int i = (position - 1); i < arr.length -1; i++) {
            arr[i] = arr[i + 1];
        }

        return temp;
    }
}
