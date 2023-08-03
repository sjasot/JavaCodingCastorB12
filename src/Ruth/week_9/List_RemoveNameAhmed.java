package Ruth.week_9;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveNameAhmed {
    /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
    Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(); // create ArrayList
        nameList.add("Ahmed");
        nameList.add("John");
        nameList.add("Eric");
        nameList.add("Ahmed");
        nameList.add("Aaron");

        removeName(nameList,"Ahmed");

        System.out.println("New List: " + nameList);

    }

    public static void removeName(List<String> nameList , String nameToRemove)
    {
        nameList.removeIf(name -> name.equals(nameToRemove));
    }
}
