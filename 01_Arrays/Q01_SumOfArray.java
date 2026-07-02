public class Q01_SumOfArray{
    public static void main(String[] args) {

        // Q-> sum of array
        
        int arr[]= {10,20,30,40,50};
        int n= arr.length;
        int sum = 0;

        for( int i=0; i<n; i++){
            int value = arr[i];
            sum= sum+value;

        }
        // sum is ready to print

        System.out.println(sum);
        }
    
}