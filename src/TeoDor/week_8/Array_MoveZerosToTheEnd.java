package TeoDor.week_8;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {
    /**
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
    public static int[] move_zero_to_the_end(int[] num) {

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                int temp;
                if (num[j] ==0) {
                    temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
        return num;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0};
        move_zero_to_the_end(arr);


    }
}
