public class Q03_UpperBound {

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
    public static void main(String[] args) {
    int arr[]={10,20,30,30,30,30,30,40};
    int target=30;
   int upperbound=GetUpperBound(arr, target);
   System.out.print(upperbound);
}
    
}
