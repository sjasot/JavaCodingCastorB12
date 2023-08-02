package IvanD.Week_8;

import java.util.Arrays;
import java.util.Scanner;

public class Array_MoveZerosToTheEnd {
    public static void moveZerosToEnd(int[] numbers) {
        int n = numbers.length;
        int index = 0;

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < n; i++) {
            if (numbers[i] != 0) {
                numbers[index++] = numbers[i];
            }
        }

        // Fill the remaining elements with zeros
        while (index < n) {
            numbers[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numberOfElements = scanner.nextInt();

        int[] numbers = new int[numberOfElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Input array: " + Arrays.toString(numbers));
        moveZerosToEnd(numbers);
        System.out.println("Output array: " + Arrays.toString(numbers));

        scanner.close();
    }
}

    /*Initialize the input array: [2, 0, 5, 0, 3, 0, 8, 1]

Initialize the index pointer to 0.

Start iterating through the array from left to right:

a. i = 0: nums[0] = 2, which is non-zero. Move it to the position indicated by the index pointer and increment the index pointer.

Array after step 3a: [2, 0, 5, 0, 3, 0, 8, 1], index = 1

b. i = 1: nums[1] = 0, which is zero. Skip it and proceed to the next element.

c. i = 2: nums[2] = 5, which is non-zero. Move it to the position indicated by the index pointer and increment the index pointer.

Array after step 3c: [2, 5, 5, 0, 3, 0, 8, 1], index = 2

d. i = 3: nums[3] = 0, which is zero. Skip it and proceed to the next element.

e. i = 4: nums[4] = 3, which is non-zero. Move it to the position indicated by the index pointer and increment the index pointer.

Array after step 3e: [2, 5, 3, 0, 3, 0, 8, 1], index = 3

f. i = 5: nums[5] = 0, which is zero. Skip it and proceed to the next element.

g. i = 6: nums[6] = 8, which is non-zero. Move it to the position indicated by the index pointer and increment the index pointer.

Array after step 3g: [2, 5, 3, 8, 3, 0, 8, 1], index = 4

h. i = 7: nums[7] = 1, which is non-zero. Move it to the position indicated by the index pointer and increment the index pointer.

Array after step 3h: [2, 5, 3, 8, 1, 0, 8, 1], index = 5

After the loop, there are no more elements to process. Fill the remaining positions from the index pointer to the end of the array with zeros.

Array after filling zeros: [2, 5, 3, 8, 1, 0, 0, 0]*/


/*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
     */