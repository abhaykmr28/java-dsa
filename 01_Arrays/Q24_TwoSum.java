public class Q24_TwoSum {
     static int[] TwoSum(int arr[] ,int target){


        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]== target){
                    int ans[]={i,j};
                    return ans;
                } 
            }
        }
        int ans[]={};
        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int target=8;
        int finalans[]=TwoSum(arr, 8);
        for(int k:finalans){
            System.out.print(k+" ");
        }
        
    }
    
}

    

