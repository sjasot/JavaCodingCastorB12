package Serhiy.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNameAhmed {
    /*
    Given a list of people names: "Ahmed", "John", "Eric", "Ahmed", "Aaron".....
    Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","John", "Eric", "Ahmed", "Aaron"));

        System.out.println(removeName_1(names));
        System.out.println(removeName_2(names));
        System.out.println(removeName_3(names));
    }

    //solution 1
    public static List<String> removeName_1(List<String> names) {

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {  // if hasNext() is true
            if (it.next().equals("Ahmed")) // next() is true
                it.remove();
        }
        return names;
    }


    // solution 2 --> .removeAll()
    public static List<String> removeName_2(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }


    // solution 3 --> .removeIf() -  // helps to remove elements in Collections (iteration) -> implicitly uses Iterator
    public static List<String> removeName_3(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed")); // name (predicate): each element of the ArrayList during iteration
        return names;
    }
}
