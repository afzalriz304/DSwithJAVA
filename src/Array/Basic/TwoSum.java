package Array.Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = findTwoSum(new int[]{3, 2, 4}, 6);
        int[] set = findNumbersMakingTwoSum(new int[]{3, 2, 4, 1}, 6);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(set));

    }

    private static int[] findNumbersMakingTwoSum(int[] nums, int t) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int temp = 0;
        while (i < j) {
            if (nums[i] + nums[j] == t) {
                return new int[]{nums[i], nums[j]};
            } else if (nums[i] + nums[j] > t) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{};
    }

    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]), i};
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }


}
