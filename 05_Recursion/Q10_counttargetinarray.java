public class Q10_counttargetinarray {
    static void counttarget(int nums[], int count, int i,int target){
        // basae case rukna kab hai jab 

        if(i>=nums.length){
            System.out.println(count);
            return;
        }

        // one case solveed by me

        if(nums[i]==target){
            count++;
        }

        counttarget(nums, count, i+1,target);
       
    }
    public static void main(String[] args) {
        int nums[]={10,20,30,10,10,40,10};
        int target=10;
        int count =0;
        int i=0;
        counttarget(nums, count, i, target);
    }
    
}
