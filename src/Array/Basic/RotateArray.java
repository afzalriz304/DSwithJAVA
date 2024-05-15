package Array.Basic;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] result = rotate(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(rotateUsingRecursion(0, 5, new int[]{1, 2, 3, 4, 5, 6})));
    }

    private static int[] rotate(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int temp;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }

    private static int[] rotateUsingRecursion(int start, int end, int[] nums) {
        if (start >= end)
            return nums;
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        return rotateUsingRecursion(start+1, end-1, nums);
    }
}
