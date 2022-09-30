package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateClockwiseOneElement {
    public static void main(String[] args) {
        int[][] matrix = {{3, 4, 5},
                {5, 6, 7},
                {8, 10, 20}};
        Arrays.stream(rotateMatrix(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8},
                        {9, 10, 11, 12}, {13, 14, 15, 16}}))
                .forEach(e -> {
                    System.out.println(Arrays.toString(e));
                });
        Arrays.stream(rotateMatrix(matrix))
                .forEach(e -> {
                    System.out.println(Arrays.toString(e));
                });
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int top = 0, left = 0, c = 0, prev, curr;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int size = matrix.length * matrix[0].length;
        if (matrix.length < 2)
            return matrix;
        while (c < size-1) {
            prev = matrix[top + 1][left];
            //top wall
            for (int i = left; i <= right && c < size; i++) {
                curr = matrix[top][i];
                matrix[top][i] = prev;
                prev = curr;
                c++;
            }
            top++;
            //right wall
            for (int i = top; i <= bottom && c < size; i++) {
                curr = matrix[i][right];
                matrix[i][right] = prev;
                prev = curr;
                c++;
            }
            right--;
            //bottom wall
            for (int i = right; i >= left && c < size; i--) {
                curr = matrix[bottom][i];
                matrix[bottom][i] = prev;
                prev = curr;
                c++;
            }
            bottom--;
            //left wall
            for (int i = bottom; i >= top && c < size; i--) {
                curr = matrix[i][left];
                matrix[i][left] = prev;
                prev = curr;
                c++;
            }
            left++;
        }
        return matrix;
    }
}
