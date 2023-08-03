package TeoDor.week_7;

import java.util.Arrays;

public class Array_SortDescending {
    /**
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
    public static int[] sort_descending(int[] num){
        for(int i=0;i<num.length;i++) {
            for (int j = 0; j < num.length; j++) {
                int temp;
                if (num[i] > num[j]) {
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
        int[] arr={-2,10,20,0,7,-1,8,90};
        sort_descending(arr);
    }
}
