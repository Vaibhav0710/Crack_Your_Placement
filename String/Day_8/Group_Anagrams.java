package String.Day_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String st = String.valueOf(ca);
            if (!m.containsKey(st)) {
                m.put(st, new ArrayList<>());
            }
            m.get(st).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
