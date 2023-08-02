package Serhiy.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        System.out.println(removeValue_1(list));



    }

    //solution 1
    public static List<Integer> removeValue_1(List<Integer> list){

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }

        return list;
    }



    // solution 2
    public List<Integer> removeValue_2(List<Integer> list){
        list.removeIf(number -> number > 100);
        return list;
    }
}
