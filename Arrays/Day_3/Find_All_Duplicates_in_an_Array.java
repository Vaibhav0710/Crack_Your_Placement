package Arrays.Day_3;

import java.util.*;

public class Find_All_Duplicates_in_an_Array {
    @SuppressWarnings("unchecked")
    public List<Integer> findDuplicates(int[] nums) {
        @SuppressWarnings("rawtypes")
        List result = new ArrayList<>();
        for (int n : nums) {
            n = Math.abs(n);
            if (nums[n - 1] > 0) {
                nums[n - 1] *= -1;
            } else {
                result.add(n);
            }
        }
        return result;
    }
}