import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        FindMinMax fmm = new FindMinMax();

        int[] arr = new int[100];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new Random().nextInt(arr.length);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(fmm.findMax(arr));
        System.out.println(fmm.findMin(arr));
    }
}
