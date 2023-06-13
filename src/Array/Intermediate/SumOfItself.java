package Array.Intermediate;

public class SumOfItself {
    public static void main(String[] args) {
        //System.out.println(productExceptSelf(new int[]{1, 2, 3, 4}));
        System.out.println(increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int[] left = new int[len + 2];
        int[] right = new int[len + 2];
        int lProd = 1;
        int rProd = 1;
        left[0] = 1;
        right[0] = 1;
        left[len + 1] = 1;
        right[len + 1] = 1;

        for (int i = 0; i < len; i++) {
            lProd *= nums[i];
            left[i + 1] = lProd;
            rProd *= nums[len - 1 - i];
            right[len - i] = rProd;
        }

        for (int i = 1; i < len + 1; i++) {
            result[i - 1] = left[i - 1] * right[i + 1];
        }
        return result;

    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3)
            return false;
        int[] leftMin = new int[nums.length];
        int[] rightMax = new int[nums.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            leftMin[i] = min;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            max = Math.max(max, nums[i]);
            rightMax[i] = max;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftMin[i] < nums[i] && nums[i] < rightMax[i])
                return true;
        }
        return false;
    }
}
