package Array.Advance;

import java.util.ArrayList;
import java.util.List;

public class FourSum {

    static List<Integer> result = new ArrayList<>();
    static int[] nums = new int[]{1, 0, -1, 0, -2, 2};

    public static void main(String[] args) {
        List<Integer> result = KSum(4, 0, 0, new ArrayList<>());
        result.forEach(r -> {
            System.out.println(r);
        });
    }

    private static List<Integer> KSum(int k, int start, int target, List<Integer> current) {
        if (k != 2) {
            for (int i = start; i < result.size() - k + 1; i++) {
                current.add(nums[i]);
                KSum(k - 1, i + 1, target - nums[i], current);
                current.remove(nums[i]);
            }
        } else {
            int i = start;
            int j = nums.length - 1;
            while (i < j) {
                if (nums[i] + nums[j] == target) {
                    List<Integer> c = new ArrayList<>();
                    c.addAll(current);
                    c.add(nums[i], nums[j]);
                    result.addAll(c);
                    i++;
                    while (i < j && nums[i] == nums[i - 1]) i++;
                    j--;
                } else if (nums[i] + nums[j] > target)
                    j--;
                else
                    i++;
            }
            return result;
        }
        return result;
    }
}
