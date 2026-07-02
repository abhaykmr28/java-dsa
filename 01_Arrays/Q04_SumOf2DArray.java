public class Q04_SumOf2DArray {
     public static void main(String[] args) {

        // sum of 2d array
        

        int [][]arr= { {1,2,3}
                      ,{4,5,6} 
                      ,{7,8,9}
                    };
                
                    int sum =0;
                    
                    for(int row=0; row<arr.length; row++){
                     for(int col= 0; col<arr[row].length; col++){

                        int value= arr[row][col];
                        sum= sum+value;
                     }
                    }
                    System.out.println(sum);
    }
    
}
