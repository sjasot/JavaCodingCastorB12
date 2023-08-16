package TeoDor.week_7;

import java.util.Arrays;

public class Array_SortAscending {

    /**
     * Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10}

     */
    public static int[] sort_ascending(int[] num){

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                int temp;
                if(num[i]<num[j]){
                    temp=num[j];
                    num[j]=num[i];
                    num[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
        return num;
    }
    public static void main(String[] args) {
        int[] arr={10,-2, 9, 8, 7,-1,0};
        sort_ascending(arr);
    }
}
