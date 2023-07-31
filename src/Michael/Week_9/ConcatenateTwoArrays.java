package Michael.Week_9;

import java.util.Arrays;

public class ConcatenateTwoArrays {

    public static void main(String[] args) {

        int[] ar1 = new int[]{1, 2, 3, 4};
        int[] ar2 = new int[]{5, 6, 7, 8};

        System.out.println(Arrays.toString(concatArrays(ar1,ar2)));
    }

    public static int[] concatArrays(int[] ar1, int[] ar2) {
        int[] result = new int[ar1.length + ar2.length];
        int i = 0;

        for (int each : ar1) {
            result[i] = each;
            i++;


        }
        for (int each : ar2) {
            result[i] = each;
            i++;

        }

        return result;
    }
}

