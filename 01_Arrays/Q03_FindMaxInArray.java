public class Q03_FindMaxInArray {
        public static void main(String[] args) {
        
        int arr[]= { 10,20,44,67,13,11};
        int n= arr.length;
        int max=arr[0];

        for(int i=0; i<n; i++){

          if(arr[i]>max){

        max=arr[i];
             }
        }
         System.out.println(max);
    }
    
}
