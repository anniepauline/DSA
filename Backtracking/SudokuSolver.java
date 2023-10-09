
public class SudokuSolver {

    public static void display(int[][] board)
    {
        for(int [] row : board)
        {
            for(int num:row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static boolean solve(int[][] board,int row,int col) {

        if( row==9 ) return true;
        if( col==9 ) return solve( board , row+1, 0 );

        //if data exists, skip cell
        if( board[row][col] != 0  ) 
         return solve( board , row , col+1 );
        
         // checking combination of nums from 0-9 for all empty crlld
        for( int num = 1; num<=9; num++ ){
            if( isSafe( board , num, row, col ) ){

                board[row][col] = num;
                if( solve( board , row , col+1 ) ) return true;
                board[row][col] = 0;

            }
        }
        return false;
    }

    static boolean isSafe(int[][] board,int num, int row, int col)
    {
               for (int i = 0; i < board.length; i++) {
                // check if the number is in the row
                if (board[row][i] == num) {
                    return false;
                }
                 // check if the number is in the row
                if (board[i][col] == num) {
                    return false;
                }
            }
        //3*3 matrix start
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - (row%sqrt);
        int colStart = col - (col%sqrt);

        //check for num in 3*3 matrix
        for(int r = rowStart; r <rowStart+sqrt;r++)
        {
            for(int c= colStart; c<colStart+sqrt;c++)
            {
                if(board[r][c] == num)
                {
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] a)
    {
        int[][] board = new int[][]{
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };
    if (solve(board,0,0)) {
        display(board);
    } else {
        System.out.println("Cannot solve");
    }
        
    }
}
