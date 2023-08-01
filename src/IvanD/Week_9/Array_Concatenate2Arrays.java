package IvanD.Week_9;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Concatenate2Arrays {
   /*
    Write a return method that can concatenate two arrays
    */
   public static int[] readArray() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
       int size = scanner.nextInt();

       int[] array = new int[size];
       System.out.print("Enter " + size + " elements of the array separated by spaces: ");

       for (int i = 0; i < size; i++) {
           array[i] = scanner.nextInt();
       }

       return array;
   }

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int index = 0;
        for (int element : array1) {
            result[index] = element;
            index++;
        }

        for (int element : array2) {
            result[index] = element;

            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = readArray();
        int[] array2 = readArray();

        int[] concatenatedArray = concatenateArrays(array1, array2);
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }
}
