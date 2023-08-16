package TeoDor.week_6;

public class Array_FindMaximum {
    /**
    Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

     */
    public static int maximum_number(int[] num) {

        int max = num[0]; // assume that first element is the maximum number
        for (int i = 1; i < num.length; i++) {
            if(num[i] > max){ // compares the element of the array with current maximum number
                max = num[i]; // replace the current maximum number
            }
        }
        System.out.println("maximum number : " + max);
        return max;
    }

    public static void main(String[] args) {

        int[] num = new int[]{99, 12, 23, 32, 44, 57, 6};
        maximum_number(num);
    }
}
