package Matrix;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        //int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Arrays.stream(transpose(matrix))
                .forEach(e -> {
                    System.out.println(Arrays.toString(e));
                });
    }

    private static int[][] transpose(int[][] matrix) {
        if (matrix == null)
            return null;

        int[][] transpose = new int[matrix[0].length][matrix.length];
        // first rotate the matrix anti-clockwise
        int top, bottom, temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
