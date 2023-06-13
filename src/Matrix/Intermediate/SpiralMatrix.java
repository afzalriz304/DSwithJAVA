package Matrix.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {10, 11, 12, 5}, {9, 8, 7, 6}};
        spiralOrder(matrix).stream().forEach(System.out::println);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return result;
        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int left = 0;

        int elements = matrix[0].length * matrix.length;
        int c = 0;
        while (c < elements) {
            // top
            for (int i = left; i <= right && c < elements; i++) {
                result.add(matrix[top][i]);
                c++;
            }
            top++;
            // right
            for (int i = top; i <= bottom && c < elements; i++) {
                result.add(matrix[i][right]);
                c++;
            }
            right--;
            // bottom
            for (int i = right; i >= left && c < elements; i--) {
                result.add(matrix[bottom][i]);
                c++;
            }
            bottom--;
            // left
            for (int i = bottom; i >= top && c < elements; i--) {
                result.add(matrix[i][left]);
                c++;
            }
            left++;
        }
        return result;
    }
}
