package Ruth.week_9;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();// create ArrayList
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(101);
        numList.add(200);

        System.out.println("List before removing values grater than 100: "+ numList);

        for(int i = numList.size() - 1; i>= 0; i--){
            //
            if(numList.get(i) > 100){

                numList.remove(i);
            }

        }

        System.out.println("List after removing values greater than 100: "+ numList);


    }

}
