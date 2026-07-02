public class Q4_FindMinInArray {
     public static void main(String[] args) {
        
        int arr[]= {1,2,3,8,9,33,-1,22,33,-3};
        int n= arr.length;
        int min= arr[0];

        for(int i=0; i<n; i++){
        if (arr[i]<min){
            min= arr[i];

        }
        }
        System.out.println(min);
        
    }
    
}
