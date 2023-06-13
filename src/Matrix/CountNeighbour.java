package Matrix;

public class CountNeighbour {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("count" + neighbour(matrix, i, j));
            }
        }
    }

    public static int neighbour(int[][] matrix, int row, int col) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int mUp = row - 1 < 0 ? row : row - 1;
        int nUp = col - 1 < 0 ? col : col - 1;
        int mLow = row + 1 > m ? row : row + 1;
        int nLow = col + 1 > n ? col : col + 1;
        System.out.println("Neighbours of i " + row + " j " + col);
        int count = 0;
        for (int i = mUp; i <= mLow; i++) {
            for (int j = nUp; j <= nLow; j++) {
                if (i == row && j == col) {
                    continue;
                } else {
                    System.out.print(matrix[i][j] + ",");
                    count++;
                }
            }
        }
        return count;
    }
}
