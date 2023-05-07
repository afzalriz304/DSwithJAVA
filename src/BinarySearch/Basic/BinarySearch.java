package BinarySearch.Basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 4, 5, 12};
        System.out.println(binarySearchUsingRecursion(0, nums.length - 1, nums, 5));
        System.out.println(binarySearchUsing(0, nums.length - 1, nums, 5));
    }

    private static int binarySearchUsing(int start, int end, int[] nums, int target) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static int binarySearchUsingRecursion(int start, int end, int[] nums, int target) {
        int mid = (start + end) / 2;
        if (nums[mid] == target)
            return mid;
        if (start > end)
            return -1;
        if (nums[mid] > target) {
            return binarySearchUsingRecursion(start, mid - 1, nums, target);
        } else {
            return binarySearchUsingRecursion(mid + 1, end, nums, target);
        }
    }
}
