package Matrix;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        Arrays.stream(rotating(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8},
                        {9, 10, 11, 12}, {13, 14, 15, 16}}))
                .forEach(e -> {
                    System.out.println(Arrays.toString(e));
                });
    }

    public static int[][] rotating(int[][] matrix) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < j) {
            int top = i;
            int bottom = j;
            for (int k=0;k<j-i;k++){
                int temp = matrix[top][top+k];
                matrix[top][top+k]=matrix[bottom-k][top];
                matrix[bottom-k][top]=matrix[bottom][bottom-k];
                matrix[bottom][bottom-k]=matrix[top+k][bottom];
                matrix[top+k][bottom]=temp;
            }
            i++;
            j--;
        }
        return matrix;
    }

    private static int[][] rotate(int[][] matrix) {
        int i = 0;
        int j = matrix.length - 1;
        int temp;
        int top;
        int bottom;
        while (i < j) {
            top = i;
            bottom = j;
            for (int p = 0; p < j - i; p++) {
                // saving the first top element
                temp = matrix[top][top + p];
                // replacing top with bottom
                matrix[top][top + p] = matrix[bottom - p][top];
                // replacing bottom with right bottom
                matrix[bottom - p][top] = matrix[bottom][bottom - p];
                // replacing right bottom with top right
                matrix[bottom][bottom - p] = matrix[top + p][bottom];
                // replacing top right with top left
                matrix[top + p][bottom] = temp;
            }
            i++;
            j--;
        }
        return matrix;
    }
}

