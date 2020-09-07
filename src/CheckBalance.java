public class CheckBalance {


    public boolean checkBalance(int[]arr){
        int rightPart = 0;

        for (int i = 0; i < arr.length; i++) {
            rightPart += arr[i];

            int leftPart = 0;
            for (int j = (i + 1); j < arr.length ; j++) {
                leftPart += arr[j];
            }

            if (rightPart == leftPart){
                return true;
            }
        }

        return false;

    }
}
