package Array.Intermediate;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        //int[] nums = new int[]{2, 0, 1};
        int[] result = sort012(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sort012(int[] nums) {

        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        int temp;
        while (j <= k) {
            if (nums[j] == 2) {
                temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            } else if (nums[j] == 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
                i++;
            } else {
                j++;
            }
        }
        return nums;
    }
}
