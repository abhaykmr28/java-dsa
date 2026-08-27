public class Q08_FIndmax {

    static void findmax(int []nums,int maxi, int i){
        int n=nums.length;

    // base case
    if(i>=n){
         System.out.println(maxi);
        return ;
    }
        
        if(nums[i]>maxi){
            maxi=nums[i];
        }
        // recursive call

        findmax(nums,maxi,i+1);
    
    }

    public static void main(String[] args) {
        int []nums={10,20,30,40,50,60};
        int maxi=Integer.MIN_VALUE;
        int i=0;
        findmax(nums, maxi,i);
       

    }
    
}
