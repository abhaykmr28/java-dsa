public class Q30_MaximumSubarray {

    static int maxsubarray(int arr[]){
        int sum=0;
        int maxi= Integer.MIN_VALUE;
        int n = arr.length;

        for(int i=0; i<n; i++){
            // step 1: sum variable create kro taki sum store kar ske

            sum= sum+arr[i];
            // step 2: maxi update kro sum ke sath compare karke

            maxi= Math.max(maxi, sum);

            // step 3: if sum is neagitive then toh usko zero kro 

            if(sum<0){
                sum =0;
            }

        }

        return maxi;
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        int ans=maxsubarray(arr);
        System.out.println(ans);
    }
}
