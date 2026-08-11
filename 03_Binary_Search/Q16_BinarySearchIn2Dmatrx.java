public class Q16_BinarySearchIn2Dmatrx {
     public boolean searchMatrix(int[][] matrix, int target) {
        int totalrow=matrix.length;
        int totalcol=matrix[0].length;
        // n-> total element

        int n = totalrow*totalcol;
        // think like 1d array
        int s=0;  
        int e=n-1;

        // binary serch
        while(s<=e){
            int mid=s+(e-s)/2;

            int rowindex=mid/totalcol;
            int colindex=mid%totalcol;
            
            if(matrix[rowindex][colindex]==target){
                return true;

            }

            // mid<target search in right half

            else if(matrix[rowindex][colindex]<target){
                s=mid+1;
            }

            else{
                e=mid-1;
            }
        }

        return false;
        
    }
    
}
