package backtracking;

public class Queen {
    private boolean[][] chessTable;
    private int numberOfQueens;


    public Queen(int numberOfQueens) {
        this.numberOfQueens = numberOfQueens;
        this.chessTable = new boolean[numberOfQueens][numberOfQueens];
    }

    public String solve(){
        if (setQueens(0)){
            return solution();
        }
        //throw new RuntimeException("There is no solution");
        return null;
    }

    private String solution() {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < numberOfQueens; i++){
            for (int j = 0; j < numberOfQueens; j++){
                if (chessTable[i][j]) {
                    result.append("N");
                }else {
                    result.append("-");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    private boolean setQueens(int colIndex) {
        if (colIndex == numberOfQueens) {
            return true;
        }

        for (int rowIndex = 0; rowIndex < numberOfQueens; rowIndex++) {
            if (isValid(rowIndex, colIndex)) {
                chessTable[ rowIndex ][ colIndex ] = true;
                if (setQueens(colIndex+1)) {
                    return true;
                }

                // BACKTRACK
                chessTable[ rowIndex ][ colIndex ] = false;
            }
        }
        return false;
    }

    private boolean isValid(int rowIndex, int colIndex) {
        for (int i = 0; i < colIndex; i++){
            if (chessTable[rowIndex][i]){
                return false;
            }
        }

        for (int i = rowIndex, j = colIndex; i >= 0 && j >= 0; i--, j--) {
            if (chessTable[i][j]){
                return false;
            }
        }

        for (int i = rowIndex, j = colIndex; i < numberOfQueens && j >= 0; i++, j--) {
            if (chessTable[i][j]){
                return false;
            }
        }

        return true;
    }
}
