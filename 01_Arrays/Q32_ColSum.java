import java.util.ArrayList;
import java.util.List;

public class Q32_ColSum {
     static List<Integer> colsum(int [][]arr){
        

        List<Integer> list = new ArrayList<>();
        int n= arr.length;
        int m= arr[0].length;

        for(int i=0; i<m; i++){
            int sum=0;
            for( int j=0; j<n; j++){
                int value= arr[j][i];

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
            System.out.println(colsum(arr));    
    }
}
