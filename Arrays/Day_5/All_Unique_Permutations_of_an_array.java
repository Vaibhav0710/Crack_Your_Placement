import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String S[] = read.readLine().split(" ");
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++)
                arr.add(Integer.parseInt(S[i]));
            All_Unique_Permutations_of_an_array ob = new All_Unique_Permutations_of_an_array();
            ArrayList<ArrayList<Integer>> res = ob.uniquePerms(arr, n);
            for (int i = 0; i < res.size(); i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}

public class All_Unique_Permutations_of_an_array {
    ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        arr.sort(null);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[n];
        solve(arr, used, temp, result);
        return result;
    }

    private static void solve(ArrayList<Integer> arr, boolean[] used, ArrayList<Integer> temp,
            ArrayList<ArrayList<Integer>> result) {
        if (temp.size() == arr.size()) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (used[i] || (i > 0 && arr.get(i).equals(arr.get(i - 1)) && used[i - 1])) {
                continue;
            }
            used[i] = true;
            temp.add(arr.get(i));
            solve(arr, used, temp, result);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
