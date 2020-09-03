import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ShiftElements se = new ShiftElements();
        int[]arr = {1,2,3,4,5,6,7,8,9,10};

        se.shiftElements(arr, 3);

        System.out.println(Arrays.toString(arr));

    }
}
