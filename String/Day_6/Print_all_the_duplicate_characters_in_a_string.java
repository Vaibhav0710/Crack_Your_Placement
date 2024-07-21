package String.Day_6;

import java.util.HashMap;
import java.util.Map;

public class Print_all_the_duplicate_characters_in_a_string {
    static void printDups(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (count.containsKey(str.charAt(i)))
                count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
            else
                count.put(str.charAt(i), 1);
        }
        for (Map.Entry<Character, Integer> mapElement : count.entrySet()) {
            if (mapElement.getValue() > 1)
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
        }
    }

    public static void main(String args[]) {
        String str = "test string";
        printDups(str);
    }
}