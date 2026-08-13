public class Q18_RowWithMaxones {
    
// firstly find the first occourence for each row
static int GetFirstOneOccurence(int [][]arr,int rowIndex){
int totalrow=arr.length;
int totalcol=arr[0].length;
int ans=-1;

    // handling that case when there is no ones in row
    if(arr[rowIndex][totalcol-1]==0){
        // then im sure thete is no one this row
        // so for this row ones count zero jana chaiye 
        // vo kiase jayega, jab total col me total col ki vlaue hi minus hogi 
        return totalcol;
    }

    else{
        // when ther eis atleast one in a row
        int s=0;
        int e=totalcol-1;
        while(s<=e){
            int mid= s+(e-s)/2;

            if((arr[rowIndex][mid])==0){
                // sure hai ki 1's rightme hi honge, move sot right
                s=mid+1;

            }

            else{
                // jab arr[mid]==1; hoga,mid maybe the potential sol index
                // store it and move to left there should be nay one left side if mid
                ans=mid;
                e=mid-1;

            }

        }

        return ans;
    }

}

static int rowwithMaximumOnes(int[][] mat) {
    int totalrow=mat.length;
    int totalcol=mat[0].length;
    int maxi=-1; // ye abb tak ke max 1's ko store kregi 
    int maxrowwaliRowIndex=-1;

     
     // go to each row and found no. of 1's

     for(int row=0; row<totalrow; row++){
        // row pe aa gye 
        // for each row find first occourence
        int firstoccurenceindex= GetFirstOneOccurence(mat,row);
        // col-f.oc kreke toal ones nikal lunga..
        int onescount=totalcol-firstoccurenceindex;

        // abb one count aaa gya hai 
        if((onescount)!=0 && onescount>maxi){
            maxi=onescount;
        // and jis row ke liye ye max count one aya hai 
        // uss row ki index ko update kardo
         maxrowwaliRowIndex=row;

        }



     }
     return maxrowwaliRowIndex;

    
}
    public static void main(String[] args) {
        int [][]mat={{0,0,0,1},
                     {0,0,1,1}, 
                     {0,1,1,1}, 
                     {1,1,1,1}
                    };
       int ans=rowwithMaximumOnes(mat);
       System.out.println(ans);
    }
    
}
