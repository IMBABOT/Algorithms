import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ShiftElementsLeft sl = new ShiftElementsLeft();
        int amount = 7;

        int[] arr = new int[amount];

        for (int i = 0; i < amount ; i++) {
            arr[i] = i + 1;
        }


        System.out.println(Arrays.toString(arr));
        sl.shiftLeft(arr, -3);
        System.out.println(Arrays.toString(arr));



    }
}
