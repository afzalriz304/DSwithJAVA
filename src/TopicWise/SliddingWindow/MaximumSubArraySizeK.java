package TopicWise.SliddingWindow;

public class MaximumSubArraySizeK {
    public static void main(String[] args) {
        int k = 7;
        int[] arr = new int[]{2, 5, 1, 8, 2, 9, 1};
        System.out.println(maxSubArray(arr, k));
        System.out.println(usingTwoPointers(arr, k));
    }

    private static int usingTwoPointers(int[] arr, int k) {
        if (arr.length == 0)
            return 0;
        if (arr.length == 1)
            return arr[0];
        if (k > arr.length)
            return 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k)
                j++;
            else {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }

    private static int maxSubArray(int[] arr, int k) {
        int max = 0;
        if (arr.length == 0)
            return 0;
        if (arr.length == 1)
            return arr[0];
        if (k <= arr.length) {
            for (int i = 0; i < k; i++) {
                max += arr[i];
            }
        }
        int currentMax = max;
        for (int i = k; i < arr.length; i++) {
            currentMax += arr[i] - arr[i - k];
            max = currentMax > max ? currentMax : max;
        }
        return max;
    }
}
