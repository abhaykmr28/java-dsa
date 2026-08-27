public class Q09_LinearsearchUsingRecursion {

    static int linearsearch(int nums[], int i, int target){
        // base case

        if(i>=nums.length){
            return -1;
        }

        // 
        if(nums[i]==target){
            
            return i;
        }

    // recursive reltaion
     int ans=linearsearch(nums, i+1, target);  // jpbhi value recursion se ayeagi usko store kar liya hai ans me
     return ans;

    }
    public static void main(String[] args) {
        int nums[]={10,20,30,40,50,60,70};
        int target=60;
        int i=0;
        int ans=linearsearch(nums,i, target);
        System.out.println(ans);
    }
}
