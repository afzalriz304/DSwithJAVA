package Array.Intermediate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        // int[] nums = {1,-1,-1,0};
        // int[] nums = {0,0,0,0};
        //int[] nums = {3, 0, -2, -1, 1, 2};
        List<List<Integer>> result = threeSum(nums, 0);
        result.stream().forEach(l -> {
            System.out.println(l);
        });
    }

    public static List<List<Integer>> threeSum(int[] arr, int K) {
       /* HashSet<List<Integer>> result = new HashSet<>();
        Arrays.sort(arr);
        int current;
        for (int p = 0; p < arr.length; p++) {
            current = arr[p];
            int i = p + 1;
            int j = arr.length - 1;
            int sum = K - current;
            while (i < j) {
                if (arr[i] + arr[j] == sum) {
                    result.add(Arrays.asList(current, arr[i], arr[j]));
                    i++;
                    j--;
                } else if (arr[i] + arr[j] > sum) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return result.stream().collect(Collectors.toList());*/
        HashSet<List<Integer>> sets = new HashSet<>();
        int k = 0;
        int i;
        int j;
        int target = 0;
        Arrays.sort(arr);
        while (k < arr.length - 2) {
            i = k + 1;
            j = arr.length - 1;
            target = -1 * (arr[k]);
            while (i < j) {
                if (arr[i] + arr[j] == target) {
                    sets.add(Arrays.asList(arr[k], arr[i], arr[j]));
                    i++;
                    j--;
                } else if (arr[i] + arr[j] < target) {
                    i++;
                } else {
                    j--;
                }
            }
            k++;
        }
        return sets.stream().collect(Collectors.toList());
    }
}
