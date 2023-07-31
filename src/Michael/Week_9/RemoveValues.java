package Michael.Week_9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValues {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,100,200,500));
        ArrayList<Integer> num2 = new ArrayList<>();

        for (int each : num){
            if(each < 100){
                num2.add(each);
            }

        }
        System.out.println(num2);
    }
}
