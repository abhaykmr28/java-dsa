import java.util.ArrayList;
import java.util.HashSet;

public class Q18_IntersectionOfArray {

    static int [] intersection(int []nums1, int []nums2){
          HashSet<Integer>set= new HashSet<>();
    ArrayList<Integer>ans=new ArrayList<>();
    
    for(int x : nums1){
        set.add(x);
    }
     for(int x: nums2){
        if(set.contains(x)){
            ans.add(x);
            set.remove(x);
        }
     }
     int result[]= new int[ans.size()];
    
     for(int i=0; i<ans.size(); i++){
        result[i]=ans.get(i);
     }
     return result;
        
    }

    
}
