public class Q2_LowerBound {

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
public static void main(String[] args) {
    int arr[]={10,20,30,30,30,30,30,40};
    int target=30;
    int lowerbound=GetLowerBound(arr, target);
    System.out.println(lowerbound);
}
    
}
