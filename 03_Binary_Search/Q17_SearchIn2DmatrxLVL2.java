public class Q17_SearchIn2DmatrxLVL2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrow=matrix.length;
        int totalcol=matrix[0].length;

        // for staring me kha par hai
        
        int row=0;
        int col=totalcol-1;

        while(row< totalrow && col>=0){

            if(matrix[row][col]==target){
                return true;
            }

            else if (matrix[row][col]>target){
                // target chota hai current value se 
                // move to left
                col--;
            }

            else{
                // matrix[row][col]<target
                // target bda hai moe to down
                row++;
            }

        }

        return false;
  
    }
}
