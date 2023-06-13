package TopicWise.SliddingWindow.VariableSize.Array;

public class MaxConsecutive1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(longestOnes(nums, 2));
    }

    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int current = 0;
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == 1) {
                current++;
                j++;
            } else if (nums[j] == 0) {
                if (k > 0) {
                    current++;
                    k--;
                    j++;
                } else {
                    max = Math.max(current,max);
                    while (i<nums.length && k == 0) {
                        if (nums[i] == 0) {
                            k++;
                        }
                        i++;
                        current--;
                    }
                }
            }
        }
        max = Math.max(current,max);
        return max;
    }
}
