package TeoDor.week_7;

public class Array_FindMinimum {
    /**
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static int minimum_number(int[] num) {

        int min = num[0]; // assume that first element in Array is the minimum number

        for (int i = 1; i < num.length; i++) {// iterate through all Array and get each element from this Array

            if(num[i] < min){ // compares the element of the array with current minimum number
                min = num[i]; // replace the current minimum number
            }
        }
        System.out.println("minimum number :  " + min); //regular print statement
        return min; //access to the result of all logic-calculation in this method from other methods
    }

    public static void main(String[] args) {

        int[] num = new int[]{99, 12, 23, 32, 44, 57, 6};
        minimum_number(num);
    }
}
