public class Q14_SearchInAlmostSortedArray {
    static int searchinalmostsortedarray(int arr[],int k){
        int n=arr.length;
        int s=0;
        int e=n-1;
         while (s<=e) {
            int mid=s+(e-s)/2;

            if(arr[mid-1]>=0 && arr[mid-1]==k){
                return mid;
            }
            
            if(arr[mid]==k){
                return mid;

            }

            if(arr[mid+1]<=arr[n-1] && arr[mid+1]==k){
                return mid;

            }

            else if(mid>k){
                // target chota hi toh left side milega right ke 
                e=mid-2;
            }

            else{
                s=mid+2;
            }
         }
         return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={3,5,10,9,11};
        int k=10;
        int ans=searchinalmostsortedarray(arr, k);
        System.out.println(ans);
    }
}
