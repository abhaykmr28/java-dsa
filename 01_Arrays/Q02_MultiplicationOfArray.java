public class Q02_MultiplicationOfArray {
     public static void main(String[] args) {
        
        // multiplication of array


        int arr[]= {1,2,3,4,5};
        int n= arr.length;
        int multiplication = 1;

        for( int i =0 ; i<n; i++){
            int value = arr[i];
            multiplication = multiplication*value;

        }
        // now multiplication is done

        System.out.println(multiplication);
    }
    
}
