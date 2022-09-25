package TopicWise.SliddingWindow.VariableSize.Array;

import java.util.Map;

public class LargestSumOfSizeK {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 1, 1, 2, 5, 3, 2};
        System.out.println(largestSumInArrayOfSizeK(nums, 4));
    }

    private static int largestSumInArrayOfSizeK(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int[] maxWindow = new int[2];
        int i = 0;
        int j = 0;
        int len = nums.length;
        int current = 0;
        while (j < len) {
            if (current > k) {
                current -= nums[i];
                i++;
            } else if (current < k) {
                current += nums[j];
                j++;
            } else {
                if (j - i + 1 > max) {
                    max = j - i + 1;
                    maxWindow[0] = i;
                    maxWindow[1] = j - 1;
                }
                current -= nums[i];
                i++;
            }
        }
        System.out.println(maxWindow[0] + " : " + maxWindow[1]);
        return max;
    }
}
