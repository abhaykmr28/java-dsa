public class Q10_PositiveSumAndNegativeSum {

    static int[] positiveAndnegativeSum(int arr[]){
        int posSum=0;
        int negSum=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>0){
                posSum=posSum+arr[i];
            }
            else{
                negSum=negSum+arr[i];
            }
        }
        int ans[]={posSum,negSum};
        return ans;
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,5,-2,-4,9,-8};
        int bothsum[]=positiveAndnegativeSum(arr);
        System.out.println("positive sum is "+bothsum[0]);
        System.out.println("negative sum is "+ bothsum[1]);
        
        
    }
    
}
