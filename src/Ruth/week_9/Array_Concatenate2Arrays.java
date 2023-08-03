package Ruth.week_9;

import java.util.Arrays;

public class Array_Concatenate2Arrays {
   /*
    Write a return method that can concatenate two arrays
    */
    public static void main(String[] args) {
     int [] num1 = {1,2,3};
     int [] num2 = {4,5,6};

     String[] name1 = {"alfa","omega", "delta"};
     String[] name2 = {"Ruth","Mariana", "Lucas"};

     int [] concatenateArrays = concatenate_arrays(num1,num2);
     String [] concatenateArrays1 = concatenate_arrays(name1,name2);

     System.out.println("concatenateArrays = " + Arrays.toString(concatenateArrays));
     System.out.println("concatenateArrays1 = " + Arrays.toString(concatenateArrays1));



    }

    public static int[] concatenate_arrays(int[] array1, int[] array2) {

        int[] result = new int[array1.length + array2.length];

        // Copy elements from array1 to result
        {
            int i = 0;
            while (i < array1.length) {
                result[i] = array1[i];
                i++;
            }
        }

        // Copy elements from array2 to result
        int i = 0;
        while (i < array2.length) {
            result[array1.length + i] = array2[i];
            i++;
        }

        return result;
    }

    public static String[] concatenate_arrays(String[] array1, String[] array2){

        // create a new Array + copy elements of array1 + definite new length.
        String [] result = Arrays.copyOf(array1,array1.length + array2.length);

        System.arraycopy(array2,0,result,array1.length,array2.length);

        return result;

    }
}
