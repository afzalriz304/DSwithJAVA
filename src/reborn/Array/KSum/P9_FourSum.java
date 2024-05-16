package reborn.Array.KSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P9_FourSum {

    public static void main(String[] args) {
        int[] nums0 = new int[]{2, 2, 2, 2, 2};
        int[] nums1 = new int[]{1, 0, -1, 0, -2, 2};
        int[] nums2 = new int[]{1000000000, 1000000000, 1000000000, 1000000000};
        System.out.println(fourSum(nums0,8));
        System.out.println(fourSum(nums1,0));
        System.out.println(fourSum(nums2, -294967296));
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        if (n > 3) {
            Arrays.sort(nums);
            for (int i = 0; i < n - 3; i++) {
                for (int j = i + 1; j < n - 2; j++) {
                    int left = j + 1;
                    int right = n - 1;
                    double currentT;
                    if (target == 0) {
                        currentT = -1 * (nums[i] + nums[j]);
                    } else {
                        currentT = (double) target - (double) nums[i] - (double) nums[j];
                    }
                    while (left < right) {
                        if (nums[left] + nums[right] == currentT) {
                            set.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                            left++;
                            right--;
                        } else if (nums[left] + nums[right] > currentT) {
                            right--;
                        } else {
                            left++;
                        }
                    }
                }
            }
        }
        for (List l : set) {
            result.add(l);
        }
        return result;
    }
}
