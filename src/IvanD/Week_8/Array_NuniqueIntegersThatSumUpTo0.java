package IvanD.Week_8;

import java.util.Arrays;
import java.util.Scanner;

public class Array_NuniqueIntegersThatSumUpTo0 {
    public static int[] calculateZeroSumArray(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N must be between 2 and 99 (exclusive).");
        }

        int[] arr = new int[N];

        // Calculate the sum of N-1 consecutive negative integers starting from -1
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            arr[i] = -(i + 1);
            sum += arr[i];

            /*

            arr[0] = -(0 + 1) = -1
            arr[1] = -(1 + 1) = -2
            arr[2] = -(2 + 1) = -3
            arr[3] = -(3 + 1) = -4

            sum = -1+(-2)+(-3)+(-4)
            sum = -10

            arr[N-1] = - sum
            arr[4] = -10


            */
        }

        // Calculate the last number to ensure the sum is zero
        arr[N - 1] = -sum;

        return arr;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 and 100");
        int N = input.nextInt();
        int[] result = calculateZeroSumArray(N);


        System.out.println("Calculate array with N = " + N + ": " + Arrays.toString(result));

    }


}

/*Array - N unique integers that sum up to 0

Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).

Array - Move Zeros to the End

Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]*/

/*
    Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */