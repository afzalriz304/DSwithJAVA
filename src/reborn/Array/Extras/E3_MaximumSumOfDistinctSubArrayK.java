package reborn.Array.Extras;

import java.util.HashMap;
import java.util.Map;

public class E3_MaximumSumOfDistinctSubArrayK {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 4, 2, 9, 9, 9};
        System.out.println(maximumSumOfDistinctSubArrayK(nums, 3));
    }

    private static long maximumSumOfDistinctSubArrayK(int[] nums, int k) {
        if (k > nums.length)
            return 0;
        Map<Integer, Integer> windowMap = new HashMap<>();
        long max = 0;
        int i = 0;
        int j = 0;
        long sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            windowMap.put(nums[j], windowMap.getOrDefault(nums[j], 0) + 1);
            if (j - i + 1 < k) {
                j++;
            } else {
                if (windowMap.size() == k)
                    max = Math.max(sum, max);
                sum -= nums[i];
                windowMap.put(nums[i], windowMap.getOrDefault(nums[i], 0) - 1);
                if (windowMap.get(nums[i]) == 0)
                    windowMap.remove(nums[i]);
                i++;
                j++;
            }
        }
        return max;
    }
}
