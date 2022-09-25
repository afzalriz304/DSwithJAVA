package TopicWise.SliddingWindow.FixedSize.Array;

import java.util.Arrays;
import java.util.Vector;

public class FirstNonNegative {
    public static void main(String[] args) {
        int[] nums = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
        Arrays.stream(findFirstNonNegative(nums, 3)).forEach(System.out::println);
    }

    private static int[] findFirstNonNegative(int[] nums, int k) {

        Vector<Integer> list = new Vector<>();
        if (nums.length == 0)
            return new int[]{};
        int[] result = new int[nums.length - k + 1];
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (j - i + 1 < k) {
                if (nums[j] < 0) {
                    list.add(nums[j]);
                }
                j++;
            } else {
                if (nums[j] < 0)
                    list.add(nums[j]);

                if (!list.isEmpty()) {
                    int element = list.get(0);
                    result[i] = element;
                    if (list.contains(nums[i]))
                        list.remove(0);
                } else
                    result[i] = 0;

                i++;
                j++;
            }
        }
        return result;
    }

}
