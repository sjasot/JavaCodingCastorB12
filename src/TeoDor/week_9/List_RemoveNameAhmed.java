package TeoDor.week_9;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveNameAhmed {
    /**
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
    Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Aaron","Ahmed","Mark","Eric","Ahmed","Lauren","Aaron","Ahmed"));
        ArrayList<String> newList = new ArrayList<>();// store here new list without deleted name
        for (String eachElement : list) {// iterating whole ArrayList
            if (!eachElement.equals("Ahmed")) {// checking if name is NOT "Ahmed"
                newList.add(eachElement);// if not "Ahmed" add to the newList
            }
        }
        System.out.println(list); //full list
        System.out.println(newList);//without "Ahmed"

        System.out.println("\n=======================   dynamic  ======================================\n");
        deleteTheName(list,"Eric");
    }
    public static Object deleteTheName(ArrayList list, String name) {
        ArrayList<String> newList = new ArrayList<>();
        for (Object eachElement : list) {
            if (!eachElement.equals(name)) {
                newList.add((String) eachElement);
            }
        }
        System.out.println("Full list of names: "+list);
        System.out.println("\nDeleted name: "+name+"\nNew list: "+newList);
        return newList;
    }
}
