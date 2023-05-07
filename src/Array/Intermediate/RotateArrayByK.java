package Array.Intermediate;

import java.util.Arrays;

public class RotateArrayByK {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(
                Arrays.toString(rotateArray(nums, k)));
    }

    private static int[] rotateArray(int[] nums, int k) {
        int i = 0;
        int j = nums.length - k - 1;
        int temp;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i = k+1;
        j = nums.length - 1;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = nums.length - 1;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
