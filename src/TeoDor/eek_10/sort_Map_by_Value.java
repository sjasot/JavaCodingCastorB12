package TeoDor.eek_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class sort_Map_by_Value {


    public static List<Map.Entry<String, Integer>> sort_map_by_value(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> newList = new ArrayList<>(map.entrySet());
        newList.sort(Map.Entry.comparingByValue());
        newList.forEach(System.out::println);
        System.out.println(newList);
        return newList;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("K7", 10);
        map.put("K1", 1000);
        map.put("K5", 250);
        map.put("K3", 100);
        map.put("K2", 7);
        map.put("K4", 0);
        map.put("K6", 3);
        map.put("K8", 20);

        sort_map_by_value(map);

    }

}

