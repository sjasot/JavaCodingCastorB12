package Serhiy.week_9;

import java.util.Arrays;

public class Array_Concatenate2Arrays {
   /*
    Write a return method that can concatenate two arrays
    */

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};

        int[] arr2 = {7,8,9};

        int[] result = concatTwoArrays(arr1 , arr2);

        System.out.println(Arrays.toString(result));

    }
    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;
    }

}
