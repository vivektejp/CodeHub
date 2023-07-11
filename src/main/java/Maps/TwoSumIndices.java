package Maps;

import java.util.*;

public class TwoSumIndices {
    public static int[] findTwoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60 };
        int target = 100;

        int[] indices = findTwoSumIndices(nums, target);

        if (indices.length == 2) {
            System.out.println("[" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No two numbers found that add up to the target sum.");
        }
    }
}
