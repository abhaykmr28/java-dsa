import java.util.ArrayList;
import java.util.List;

public class Q31_RowSum {
     static List<Integer> rowsum(int [][]arr){
        

        List<Integer> list = new ArrayList<>();
        int n= arr.length;
        int m= arr[0].length;

        for(int i=0; i<n; i++){
            int sum=0;
            for( int j=0; j<m; j++){
                int value= arr[i][j];

                sum=sum+value;
                
            }
            list.add(sum);
        }
            return list;

    }

    public static void main(String[] args) {
        int [][]arr= {{1,2,3},
                    {4,5,6},
                    {7,8,9}
                };
            System.out.println(rowsum(arr));    
    }
    
}
