package TeoDor.week_11;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a method that can return the minimum value from a map (DO NOT use sort method).
 */
public class Map_Min_value {
    public static void main(String[] args) {
        Map<String, Integer> entireMap = new HashMap<>();
        entireMap.put("K1", 101);
        entireMap.put("K2", 15);
        entireMap.put("K3", 20);
        entireMap.put("K4", 25);
        entireMap.put("K5", 50);
        entireMap.put("K6", 100);

//        int min = entireMap.get("K1");
//        for (int eachElement : entireMap.values()) {
//            if (eachElement < min) {
//                min = eachElement;
//            }
//        }
//        System.out.println("min value = " + min);

        min_value(entireMap);
    }

    public static int min_value(Map<String, Integer> map) {
        int min = map.values().iterator().next(); //assign value of first element is minimum
        for (int eachElement : map.values()) { //compare each Element value with min
            if (eachElement < min) { //if Element value less than min put this Element in min variable
                min = eachElement;
            }
        }
        System.out.println("min = " + min);
        return min;
    }
}
