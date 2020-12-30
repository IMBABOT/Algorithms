import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[11];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(DeleteElement.deleteElement(arr, 5));
        System.out.println(Arrays.toString(arr));
    }

}
