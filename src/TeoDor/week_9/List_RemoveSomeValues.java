package TeoDor.week_9;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveSomeValues {
    /**
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */
    public static ArrayList<Integer> removeSomeValue(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {// will iterate through whole ArrayList
            if (list.get(i)>100) { // check if each number greater than 100
                list.remove(i);// if number is more than 100 --> delete it
            }
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(105,1,121,2,9,101,45,147,55,254,7,20,311));
        removeSomeValue(nums);
    }
}
