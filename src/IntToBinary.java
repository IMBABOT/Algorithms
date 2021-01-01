public class IntToBinary {
    private static String intToBinary(int n){
        String result = "";

        while (n > 0){
            if (n % 2 == 0){
                result += "0";
            }else  if (n % 2 != 0){
                result += "1";
            }

            n = n / 2;
        }

        return new StringBuilder(result).reverse().toString();
    }
}

