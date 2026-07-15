import java.util.ArrayList;
import java.util.List;

public class Q33_PrintWaveMatrix {
    static List<Integer> wavematrix(int [][]arr){
        

        List<Integer> list = new ArrayList<>();
        int n= arr.length;
        int m= arr[0].length;

        for(int col=0; col<m; col++){
           if((col & 1)!=1){
                // n&1 ==0 even else odd   !=1 means 0 
                for(int row=0; row<n; row++){
                    int  value = arr[row][col];
                    list.add(value);
                }

            }

            else{
                for(int row=n-1; row>=0; row--){
                    int value1=arr[row][col];
                    list.add(value1);
                }
            }
        }

        return list;

    }

    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println(wavematrix(arr));
        }
}
