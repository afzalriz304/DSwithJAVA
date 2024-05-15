package reborn.Array;

import java.util.Arrays;

public class P6_Sort012 {

    public static void main(String[] args) {
        int[] nums0 = new int[]{2, 0, 2, 1, 1, 0};
        int[] nums1 = new int[]{2, 0, 1};
        System.out.println(Arrays.toString(sort012(nums0)));
        System.out.println(Arrays.toString(sort012(nums1)));
    }

    private static int[] sort012(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        while (j <= k) {
            if (nums[j] == 2) {
                swap(nums, j, k);
                k--;
            } else if (nums[j] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else {
                j++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
