package TeoDor.week_9;

import java.util.Arrays;

public class Array_Concatenate2Arrays {
   /**
               Write a return method that can concatenate two arrays
    */
   public static int[] concatenateTwoArrays(int[] first,int[] second) {
       int[] third = new int[first.length + second.length];// make sure that third array has enough capacity to contain all the elements of first and second
       int k = 0 ; // for third array's index number
       for (int i = 0; i < first.length; i++, k++) { //i: for first array's index numbers
           third[k] = first[i];}
       for (int i = 0; i < second.length; i++, k++) { //i: for second array's index numbers
           third[k] = second[i];}
       System.out.println(Arrays.toString(third));
       return third;
   }
    public static void main(String[] args) {
        int[] first = {1,2,3,4,5};
        int[] second ={6,7,8,9,10};
        concatenateTwoArrays(first,second);
    }
}
