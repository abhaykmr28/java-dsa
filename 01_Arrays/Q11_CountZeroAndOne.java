public class Q11_CountZeroAndOne {
    
    static int []CountZeroAndOne(int arr[]){

        int OneCount=0;
        int ZeroCount=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==0){
                ZeroCount++;
            }
            else{
                OneCount++;
            }
        }

        int ans[]={ZeroCount,OneCount};
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,0,0,0,0,0,0,0,0,0,0,0};
        int finalAns[]=CountZeroAndOne(arr);
        System.out.println("no. of zeros are ="+finalAns[0]);
         System.out.println("no. of ones are ="+finalAns[1]);

    }
}
