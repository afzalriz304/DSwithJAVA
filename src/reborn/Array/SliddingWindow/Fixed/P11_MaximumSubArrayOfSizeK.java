package reborn.Array.SliddingWindow.Fixed;

public class P11_MaximumSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 2, 8, 2, 9, 1};
        System.out.println(maxSubArrayOfSizeK(nums, 3));
    }

    private static int maxSubArrayOfSizeK(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            if (j - i + 1 < k) {
                j++;
            } else {
                if (sum < 0) {
                    sum = 0;
                } else {
                    max = Math.max(sum, max);
                    sum -= nums[i];
                }
                i++;
                j++;
            }
        }
        return max;
    }
}
