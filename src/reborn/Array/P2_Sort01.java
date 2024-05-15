package reborn.Array;

import java.util.Arrays;

public class P2_Sort01 {

    public static void main(String[] args) {
        int[] nums0 = new int[]{0, 1, 0, 1, 1, 0, 1};
        int[] nums1 = new int[]{1, 1, 0, 1, 1, 0, 0};
        int[] nums2 = new int[]{0, 1, 0, 1, 1, 0, 0};
        int[] nums3 = new int[]{0, 1, 1, 0, 0, 0};
        int[] nums4 = new int[]{1, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(sortO1(nums0)));
        System.out.println(Arrays.toString(sortO1(nums1)));
        System.out.println(Arrays.toString(sortO1(nums2)));
        System.out.println(Arrays.toString(sortO1(nums3)));
        System.out.println(Arrays.toString(sortO1(nums4)));
    }

    private static int[] sortO1(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
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
