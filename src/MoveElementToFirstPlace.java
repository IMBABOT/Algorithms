public class MoveElementToFirstPlace{

    public static int[] moveElementToFirstPlace(int[] arr, int n){
        int temp = arr[n];
        for (int i = (n - 1); i >= 0; i--) {
            arr[i+1] = arr[i];
        }

        arr[0] = temp;
        return arr;
    }
}

