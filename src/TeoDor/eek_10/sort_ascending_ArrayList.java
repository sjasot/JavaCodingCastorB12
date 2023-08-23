package TeoDor.eek_10;

import java.util.ArrayList;
import java.util.Arrays;

/**                             ArrayList -- Sort Ascending
 Write a method that can sort the ArrayList in Ascending order without using the sort method.
 */
public class sort_ascending_ArrayList {
    public static ArrayList<Integer> sort_ascending_array_list (ArrayList<Integer> list){

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                int temp;
                if(list.get(i) < list.get(j)){
                    temp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }
        }
        list.forEach(System.out::println);
        //System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrList= new ArrayList<Integer>(Arrays.asList(5,100,0,10,30,250));
        sort_ascending_array_list(arrList);
    }
}
