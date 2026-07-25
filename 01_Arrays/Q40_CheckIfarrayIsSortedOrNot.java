public class Q40_CheckIfarrayIsSortedOrNot {

    static boolean Checkifarrayissorted(int arr[]){
        int n= arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1])
                return false;
            
        
        }
    return true;

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        boolean ans=Checkifarrayissorted(arr);

        System.out.println(ans);
    }
    
}
