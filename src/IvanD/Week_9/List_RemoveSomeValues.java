package IvanD.Week_9;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveSomeValues {

    public static List<Integer> removeGreaterThan100(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int number : list) {
            if (number <= 100) {
                result.add(number);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 101, 200, 300));

        System.out.println("Original List: " + numbers);

        List<Integer> result = removeGreaterThan100(numbers);

        System.out.println("List after removing values greater than 100: " + result);
    }


}

/*
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */