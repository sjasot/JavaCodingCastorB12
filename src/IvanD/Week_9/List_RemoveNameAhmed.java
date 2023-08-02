package IvanD.Week_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class List_RemoveNameAhmed {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Aaron");

        System.out.println("Original List: " + names);

        removeAllOccurrences(names, "Ahmed");

        System.out.println("List after removing all 'Ahmed': " + names);
    }

    public static void removeAllOccurrences(List<String> list, String target) {
        list.removeAll(List.of(target));
    }
}



/*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
    Write a java operation to remove all the names named Ahmed
     */