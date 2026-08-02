public class Q06_PivotIndexInSortedRotatedArray {

    static int pivotIndex(int arr[]){
        int s=0;
        int n= arr.length;
        int e=n-1;
        int ans=-1;

        if(arr[s]<arr[e]){
            return -1;

        }
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]<=arr[n-1]){   // means ,mid on L1
                e=mid-1;        // move to left 

            }

            else{
                // in else case .
                // thats means arr[mid]>=arr[e]
                // thsi mid may be potential solution 
                // store this index;
                ans=mid;
                // move to right 
                s=mid+1;
                
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[]={50,60,70,10,20,30,40};
        pivotIndex(arr);
        System.out.println(pivotIndex(arr));
    }
}
