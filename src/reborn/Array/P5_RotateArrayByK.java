package reborn.Array;

import java.util.Arrays;

public class P5_RotateArrayByK {
    public static void main(String[] args) {
        int[] nums0 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] nums1 = new int[]{-1, -100, 3, 99};
        System.out.println(Arrays.toString(rotateArrayByK(nums0, 3)));
        System.out.println(Arrays.toString(rotateArrayByK(nums1, 2)));
    }

    private static int[] rotateArrayByK(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        rotate(nums, 0, nums.length - k - 1);
        rotate(nums, nums.length - k, nums.length - 1);
        rotate(nums, 0, nums.length - 1);
        return nums;
    }

    private static void rotate(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
