package TeoDor.week_11;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a method that prints the frequency of each character from a String.
 */
//================================================================================================================
//       DIDNT SOLVE TILL THE END YET
//================================================================================================================

public class Map_Frequency_of_Characters {

    public static void main(String[] args) {
        Map<String, String> entireMap = new HashMap<>();

        entireMap.put("K1", "Arthur");
        entireMap.put("K2", "Bela");
        entireMap.put("K3", "John");
        entireMap.put("K4", "Beatrice");
        entireMap.put("K5", "Samanta");
        entireMap.put("K6", "Louis");

        String rs = "";
        for (String eachElement : entireMap.values()) {
            //System.out.println("eachElement = " + eachElement);
            String result = "";
            int countRS = 0;
            for (int j = 0; j < eachElement.length(); j++) {
                char ch = eachElement.toLowerCase().charAt(j);
                //System.out.println("ch = " + ch);
                //int count = 0;
                for (int i = 0; i < eachElement.length(); i++) {
                    if (eachElement.charAt(i) == ch) {
                       // count++;
                    }
                }
                countRS++;
                if (result.contains("" + ch)) { // if the character is already included in the result
                    continue; // skip that character
                }
               // result += ch + "" + count + " ";
                result += ch + "" + countRS + " ";
            }
            System.out.println(result + "");
            System.out.println("countRS = " + countRS);
        }

    }


}
