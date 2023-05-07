package Array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(SortedArrays(new int[]{4, 5, 0, 0, 0}, new int[]{1, 2, 3}, 2, 3)));
        //optimalSolution(new int[]{4,5,6,0,0,0},new int[]{1,2,3},3,3);

    }

    private static int[] SortedArrays(int nums1[], int nums2[], int m, int n) {
        // Write your code here.
        int i = 0;
        int j = 0;
        int[] merger = new int[m + n];
        int index = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merger[index] = nums1[i];
                i++;
            } else {
                merger[index] = nums2[j];
                j++;
            }
            index++;
        }
        while (i < m) {
            merger[index] = nums1[i];
            i++;
            index++;
        }

        while (j < n) {
            merger[index] = nums2[j];
            j++;
            index++;
        }
        return merger;
    }

    private static void optimalSolution(int[] nums1, int[] nums2, int m, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (m > 0 && n > 0 && i < m) {
            if (nums1[i] <= nums2[j]) {
                nums1[k] = nums1[i];
                i++;
            } else {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
            }
            k++;
        }

        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}
