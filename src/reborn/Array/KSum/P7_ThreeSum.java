package reborn.Array.KSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P7_ThreeSum {

    public static void main(String[] args) {
        int[] nums0 = new int[]{1, 1, 2, 2, 1, 1};
        int[] nums1 = new int[]{1, 2, 3, 1, 2, 3};
        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] nums3 = new int[]{1};
        System.out.println(threeSum(nums0, 4));
        System.out.println(threeSum(nums1, 6));
        System.out.println(threeSum(nums2, 11));
        System.out.println(threeSum(nums3, 5));
    }

    private static List<List<Integer>> threeSum(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length > 2) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                int currentK = k - nums[i];
                while (left < right) {
                    if (nums[left] + nums[right] == currentK) {
                        if (!result.contains(List.of(nums[i], nums[left], nums[right]))) {
                            result.add(List.of(nums[i], nums[left], nums[right]));
                        }
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > currentK) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        if (result.isEmpty()) {
            result.add(List.of(-1));
        }
        return result;
    }


}
