package Michael.Week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John","Ahmed","James"));
        names.removeAll(List.of("Ahmed"));
        System.out.println(names);
    }
}
