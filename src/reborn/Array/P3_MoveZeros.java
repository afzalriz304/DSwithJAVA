package reborn.Array;

import java.util.Arrays;

public class P3_MoveZeros {

    public static void main(String[] args) {
        int[] nums0 = new int[]{0, 1, 0, 3, 12, 0};
        int[] nums1 = new int[]{0, 1, 0, -3, 12, 0, -5};
        System.out.println(Arrays.toString(moveZeros(nums0)));
        System.out.println(Arrays.toString(moveZeros(nums1)));
    }

    private static int[] moveZeros(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }
}
