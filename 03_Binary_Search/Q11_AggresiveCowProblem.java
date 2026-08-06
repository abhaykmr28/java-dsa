import java.util.*;
public class Q11_AggresiveCowProblem {


    static boolean isValidAns(int stall[], int k, int mid){
        int cowcnt=1;
        int lastCowIndex = 0;

        for(int i=1; i<stall.length; i++){

            if(stall[i]-stall[lastCowIndex]>=mid){
                // place new cow
                cowcnt++;
                // abb new cow place kar chuke hai toh
                // lastposition ko update kro jis index pe new cow ahi vahi last positon hogi
                
             lastCowIndex =i;
            if(cowcnt==k){
                // iska matlab saricow placed kar chuke hai 
                return true;
            }
        }
     }

        return false;

    }

    static int aggresiveCows(int stall[], int k){
        
        Arrays.sort(stall);
        int n=stall.length;
        int s=0;
        // end kha pe hai = end uss value pe hai given possition ke bich ka largest distance pe 
        
        int e=stall[n-1]-stall[0];
        int ans=-1;
    
        while (s<=e) {
            int mid=s+(e-s)/2;

            // agar mid vald distnce hai 
               if (isValidAns(stall,k,mid)){
                 ans = mid;
                  s = mid + 1;   // ✅ Try for a larger distance
            }
                else{
                         e = mid - 1;   // ❌ mid is too large, decrease it
                        }
            
        }
        return ans;
    
    
}

public static void main(String[] args) {
    int stall[]={1,2,4,8,9};
    int k=3;
    int finalans=aggresiveCows(stall, 3);
    System.out.println(finalans);
}
}