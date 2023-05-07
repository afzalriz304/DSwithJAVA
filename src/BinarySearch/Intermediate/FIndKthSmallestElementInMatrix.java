package BinarySearch.Intermediate;

public class FIndKthSmallestElementInMatrix {
    public static void main(String[] args) {
        //int result = kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8);
        int result = kthSmallest(new int[][]{{1, 2}, {1, 3}}, 3);
        System.out.println(result);
    }

    private static int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int start = matrix[0][0];
        int end = matrix[m][n];
        int mid, count;
        while (start <= end) {
            mid = (start + end) / 2;
            count = 0;
            for (int i = 0; i < m + 1; i++) {
                count += upper_bound(matrix, mid, i, n);
            }
            if (count < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static int upper_bound(int[][] matrix, int current, int m, int n) {
        int upperbound = 0;
        while (upperbound < n + 1) {
            if (matrix[m][upperbound] <= current)
                upperbound++;
            else
                return upperbound;
        }
        return upperbound;
    }
}
