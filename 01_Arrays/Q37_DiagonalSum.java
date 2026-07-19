public class Q37_DiagonalSum {
    
    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {

            // Primary Diagonal
            sum += mat[i][i];

            // Secondary Diagonal
            sum += mat[i][n - 1 - i];
        }

        // Agar matrix odd size ki hai to center element do baar add ho gaya hoga
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
    

