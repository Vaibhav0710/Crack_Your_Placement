package Arrays.Day_1;

import java.util.*;

public class Find_The_Duplicate_Number {
    // Solution on leetcode
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) {
                return x;
            }
            set.add(x);
        }
        return 0;
    }
}