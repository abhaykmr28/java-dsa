public class Q12_EkoSpojProblem {
    static boolean isvalidans(int arr[], int m, int mid){
        // ye fxn kya chek karta hai 
        // jo height mid se mil vo >=m hai ya nahi 
        long totalwoodcollected=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mid){
                long currentwoodcollected=arr[i]-mid;
                totalwoodcollected+=currentwoodcollected;
            }
        }
        if(totalwoodcollected>=m){
            return true;
        }
        return false;

    }
    static int  maxsawheight(int arr[],int m){
        int s=0;
        int n=arr.length;
        int maxi=0;
        for(int i=1; i<n; i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        int e=maxi;
        int ans=-1;

        while (s<=e) {
            int mid=s+(e-s)/2;

            if(isvalidans(arr,m,mid)){
                ans=mid;
                // valid ane pe store karte hai and chek krte hai ki or max hegiht pe ja askte hai kya 
                // move to right
                s=mid+1;

            }
            else{
                // mid not valid 
                // niche aayeo ,,left move karo 
                e=mid-1;
            }
            
        }
        return ans;
    }
    

}