public class Q34_TransposeOfMatrix {
    

    public int[][] transpose(int[][] matrix) {

        // Edge case
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }

        // Original matrix dimensions
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        // Transposed matrix dimensions
        int newRows = totalCols;
        int newCols = totalRows;

        int[][] ans = new int[newRows][newCols];

        // Fill transpose
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }
}
    

