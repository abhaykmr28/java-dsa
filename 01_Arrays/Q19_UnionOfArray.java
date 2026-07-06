import java.util.ArrayList;
import java.util.HashSet;

public class Q19_UnionOfArray {
         static int [] union(int []nums1, int []nums2){
          HashSet<Integer>set= new HashSet<>();
    ArrayList<Integer>ans=new ArrayList<>();
    
   for(int x : nums1){
    if(set.add(x)){
        ans.add(x);
    }
}
     for(int x: nums2){
        if(!set.contains(x)){
            set.add(x);
            ans.add(x);
          
        }
     }
     int result[]= new int[ans.size()];
    
     for(int i=0; i<ans.size(); i++){
        result[i]=ans.get(i);
     }
     return result;
        
    }

    public static void main(String[] args) {
        int []nums1={1,2,2,3,4};
        int []nums2={4,5,2,6};

        int finalans[]=union(nums1, nums2);
        for( int j : finalans){

            System.out.println(j);
        }
    }


    
}
