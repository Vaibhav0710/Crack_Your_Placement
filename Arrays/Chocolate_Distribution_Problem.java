package Arrays;

import java.util.*;

public class Chocolate_Distribution_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr.add(x);
            }
            int m = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.findMinDiff(arr, n, m));
        }
        sc.close();
    }
}

class Solution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        int minDiff = Integer.MAX_VALUE;
        Collections.sort(a);

        for (int i = (m - 1); i < a.size(); i++) {
            minDiff = Math.min((a.get(i) - a.get(i - (m - 1))), minDiff);
        }
        return minDiff;
    }
}