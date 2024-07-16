import java.util.*;

public class FindtheDuplicateNumber {
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