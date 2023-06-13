package Matrix.Intermediate;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(matrix);
    }
    public static void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==0){
                    int count = neighbour(board,i,j);
                    if(count==3)
                        board[i][j]=2;
                    else
                        board[i][j]=0;
                }else{
                    int count = neighbour(board,i,j);
                    if(count<2 || count>3)
                        board[i][j]=1;
                    else
                        board[i][j]=3;
                }

            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==2 || board[i][j]==3)
                    board[i][j]=1;
                else
                    board[i][j]=0;
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
        int zero=0;
        int ones=0;
        for (int i = mUp; i <= mLow; i++) {
            for (int j = nUp; j <= nLow; j++) {
                if (i == row && j == col) {
                    continue;
                } else {
                    if(matrix[i][j]==0 || matrix[i][j]==2)
                        zero++;
                    else
                        ones++;
                }
            }
        }
        return ones;
    }
}
