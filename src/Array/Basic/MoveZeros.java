package Array.Basic;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = moveZeroes(new int[]{0, 1, 0, 3, 12});
        System.out.println(Arrays.toString(nums));
    }

    private static int[] moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int temp;
        while (j < nums.length) {
            if (nums[j] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }
}
