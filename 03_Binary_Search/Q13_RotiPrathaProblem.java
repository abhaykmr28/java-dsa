public class Q13_RotiPrathaProblem {

    static boolean isvalidans(int arr[], int n,int cooks, int mid){
        int prathacount=0;
        // one by one cooks ke pas jayenge
        for(int i=0; i<arr.length; i++){
            int currentcookrank=arr[i];
            int timetaken=0;
            int j=1;

            // agar current cook ki rank R hai 
            // pratha bnege 1*r,2*r, 3*R

            // cook karn start kro 
            while (timetaken<mid) {
                if(timetaken + j*currentcookrank<=mid){
                    // matab hum ye pratah bna skte hahi 
                    timetaken=timetaken+j*currentcookrank;
                    prathacount++;
                    j++;
                }
                else{
                    // current pratha time limit me ban nahi skta hai 
                    // loop se bahr nikal
                    break;
                }
                
            }
            // jab ye loop khatam hota hai toh ye ith cook jitne pratha bna chuka hai 
            // unko pratha count me add kar chuka hai 
            if(prathacount>=n){
                return true;
            }

        }
         if(prathacount>=n){
                return true;
            }
            else{
                return false;
            }

    }
    static int minimumtime(int arr[], int n,int cooks){

        int s=0; 
        int maxr=0;
        for(int i=0; i<n; i++){
            if(arr[i]>maxr){
                maxr=arr[i];

            }
        }
            int e=maxr*n*(n+1)/2;

            int ans=-1;
            while (s<=e) {
                int mid=s+(e-s)/2;

                if(isvalidans(arr,n,cooks,mid)){
                    ans=mid;
                    e=mid-1;

                }
                else{
                    // not valid means time kam tha sara pratha nahi bna
                    s=mid+1;
                }
                
            }
            return ans;

        }


    }
    

