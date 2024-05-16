package reborn.Array;

public class P8_TrappingRainWater {

    public static void main(String[] args) {
        int[] arr0 = new int[]{2, 1, 1, 4};
        int[] arr1 = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingWaterSolution1(arr0, 4));
        System.out.println(trappingWaterOptimal(arr1, arr1.length));
        System.out.println(trappingWaterOptimal(arr0, arr0.length));
    }

    private static int trappingWaterOptimal(int[] arr, int n) {
        int i = 0;
        int j = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;
        while (i <= j) {
            if (arr[i] <= arr[j]) {
                if (arr[i] >= leftMax) {
                    leftMax = arr[i];
                } else {
                    result += leftMax - arr[i];
                }
                i++;
            } else {
                if (arr[j] >= rightMax) {
                    rightMax = arr[j];
                } else {
                    result += rightMax - arr[j];
                }
                j--;
            }
        }
        return result;
    }

    private static int trappingWaterSolution1(int[] arr, int n) {
        int result = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        int lmax = 0;
        for (int i = 0; i < n; i++) {
            lmax = (int) Math.max(lmax, arr[i]);
            leftMax[i] = lmax;
        }

        int rmax = 0;
        for (int i = n - 1; i >= 0; i--) {
            rmax = (int) Math.max(rmax, arr[i]);
            rightMax[i] = rmax;
        }

        for (int i = 0; i < n; i++) {
            result += (int) (Math.min(leftMax[i], rightMax[i])) - arr[i];
        }

        return result;
    }
}
