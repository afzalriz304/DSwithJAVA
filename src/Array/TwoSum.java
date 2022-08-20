package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int target = 6;

    public static void main(String[] args) {
        // writing pair
        int[] arr = new int[]{3, 2, 4};
        Arrays.stream(solution1(arr)).forEach(System.out::println);
        // writing indexes
        arr = new int[]{3, 2, 4};
        Arrays.stream(solution2(arr)).forEach(System.out::println);
    }

    private static int[] solution1(int[] nums) {
        Arrays.sort(nums);
        return findPair(nums, 0, nums.length - 1);
    }

    private static int[] findPair(int[] nums, int i, int j) {
        if (nums[i] + nums[j] == target)
            return new int[]{nums[i], nums[j]};
        else if (nums[i] + nums[j] > target)
            i++;
        else
            j--;
        return findPair(nums, i, j);
    }

    private static int[] solution2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (Integer n : nums) {
            if (!map.isEmpty() && map.containsKey(n))
                return new int[]{map.get(n), index};
            else
                map.put(target - n, index);
            index++;
        }
        //map.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" : "+x.getValue()));
        return new int[]{};
    }
}
