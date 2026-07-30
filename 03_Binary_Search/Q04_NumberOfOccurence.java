public class Q04_NumberOfOccurence {
    static int GetLowerBound(int arr[],int target){
    int n=arr.length;
    int  s=0;
    int e=n-1;
    int ans=n;

    while (s<=e) {
        int mid=s+(e-s)/2;

        if(arr[mid]>=target){
            ans=mid;  // ans store
            e=mid-1;   // move left

        }

        else{
            // move right
            s=mid+1;
        }
        
    }

    return ans;
}

     static int GetUpperBound(int arr[],int target){
        int s=0;
        int n=arr.length;
        int e=n-1;
        int ans=n;
        while (s<=e) {
            int mid=s+(e-s)/2;

            if(arr[mid]<=target){
                s=mid+1;
            }
            else{
                // store ans
                ans=mid;
                // move left
                e=mid-1;

            }
            
        }
        return ans;
    }

    static int Countfreq(int arr[],int target){
        int lbIndex=GetLowerBound(arr, target);
        int ubIndex=GetUpperBound(arr, target);
        int ans=ubIndex-lbIndex;
        return ans;
    }

    
}
