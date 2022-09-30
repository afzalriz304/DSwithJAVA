package Matrix;

import java.util.Arrays;

public class RotateImageAntiClockwise {
    public static void main(String[] args) {
        Arrays.stream(rotateAC(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8},
                        {9, 10, 11, 12}, {13, 14, 15, 16}}))
                .forEach(e -> {
                    System.out.println(Arrays.toString(e));
                });
    }

    private static int[][] rotateAC(int[][] arr) {
        int i = 0;
        int j = arr.length - 1;
        int top;
        int bottom;
        int temp;
        while (i < j) {
            top = i;
            bottom = j;
            for (int p = 0; p < j - i; p++) {
                //saving the left top
                temp = arr[top + p][top];
                // replacing left top with top right
                arr[top + p][top] = arr[top][bottom - p];
                // replacing top right with bottom right
                arr[top][bottom - p] = arr[bottom-p][bottom];
                // replacing bottom right with bottom left;
                arr[bottom-p][bottom] = arr[bottom][top+p];
                // replacing bottom left with top left;
                arr[bottom][top+p] = temp;

            }
            i++;
            j--;
        }
        return arr;
    }
}
