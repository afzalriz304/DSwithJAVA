package Matrix;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        Arrays.stream(setMatrix(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}))
                .forEach(e -> {
                    System.out.println(Arrays.toString(e));
                });
    }

    private static int[][] setMatrix(int[][] matrix) {
        int[] row = new int[matrix[0].length];
        int[] column = new int[matrix.length];
        // checking for row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == 1 || column[j] == 1) {
                    matrix[i][j] = 0;
                }

            }
        }
        return matrix;
    }
}
