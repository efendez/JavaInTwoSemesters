import java.util.stream.IntStream;

public class sudoku {

    public int[][] board;
    public final int ROWS;
    public final int COLS;
    public final int NO_VAL;

    public sudoku(int[][] board) {
        this.board = board;
        this.ROWS = board.length;
        this.COLS = board[0].length;
        this.NO_VAL = 0;
    }

    public boolean solve() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (this.board[row][col] == NO_VAL) {
                    for (int k = 1; k <= 9; k++) {
                        this.board[row][col] = k;
                        if (isValid(this.board, row, col) && solve()) {
                            return true;
                        }
                        this.board[row][col] = NO_VAL;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(int[][] board, int row, int col) {
        return (rowCon(board, row)
            && colCon(board, col)
            && areaCon(board, row, col));
    }

    public boolean rowCon(int[][] board, int row) {
        boolean[] cons = new boolean[9];
        return IntStream.range(0, 9).allMatch(column -> checkCons(board, row, cons, column));
    }

    public boolean colCon(int[][] board, int col) {
        boolean[] cons = new boolean[9];
        return IntStream.range(0, 9).allMatch(row -> checkCons(board, row, cons, col));
    }

    public boolean areaCon(int[][] board, int row, int col) {
        boolean[] cons = new boolean[9];
        
        int subRowStart = (row / 3) * 3;
        int subRowEnd = subRowStart + 3;
        
        int subColStart = (col / 3) * 3;
        int subColEnd = subColStart + 3;

        for (int r = subRowStart; r < subRowEnd; r++) {
            for (int c = subColStart; c < subColEnd; c++) {
                if (!checkCons(board, r, cons, c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkCons(int[][] board, int row, boolean[] cons, int col) {
        if (board[row][col] != NO_VAL) {
            if (!cons[board[row][col] - 1]) {
                cons[board[row][col] - 1] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(this.board[row][col] +  " ");
                if (col % 3 == 2) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (row % 3 == 2) {
                System.out.print("- - - - - - - - - - - -");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 3, 6, 0, 0, 0, 0, 0},
            {0, 7, 0, 0, 9, 0, 2, 0, 0},
            {0, 5, 0, 0, 0, 7, 0, 0, 0},
            {0, 0, 0, 0, 4, 5, 7, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 3, 0},
            {0, 0, 0, 0, 0, 0, 0, 6, 8},
            {0, 0, 8, 5, 0, 0, 0, 1, 0},
            {0, 9, 0, 0, 0, 0, 4, 0, 0} 
        };
        sudoku s = new sudoku(board);
        s.solve();
        s.printBoard();
    }
}