package TeoDor.week_8;

import java.util.Arrays;

public class Array_NuniqueIntegersThatSumUpTo0 {
    /**
    Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */
    public static int[] generateZeroSumArray(int N) {
        if (N < 1 || N > 100) {
            throw new IllegalArgumentException("N must be between 1 and 100");
        }
        int[] result = new int[N];
        // Generate N-1 random integers
        for (int i = 0; i < N - 1; i++) {
            int num = (int) (Math.random() * 201) - 100; // Random number between -100 and 100 (inclusive)
            result[i] = num;
            result[N - 1] -= num; // Adjust the last element to make the sum zero
        }
        return result;
    }
    public static void main(String[] args) {
        int N = 4;
        int[] zeroSumArray = generateZeroSumArray(N);
        System.out.println(Arrays.toString(zeroSumArray));
    }
}
