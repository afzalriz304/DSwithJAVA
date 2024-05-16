package reborn.Array.SliddingWindow.Variable;

public class P12_MaximumSubArraySum {

    public static void main(String[] args) {
        int[] nums0 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums1 = new int[]{5, 4, -1, 7, 8};
        System.out.println(maximumSubArraySum(nums0));
        System.out.println(maximumSubArraySum(nums1));
    }

    // Kadane's Algorithm
    private static int maximumSubArraySum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int j = 0;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
            j++;
        }
        return max;
    }

}
