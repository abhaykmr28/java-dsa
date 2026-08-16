import java.util.HashMap;

public class Q46_TwoSumUsingHasmap {
    static int[] twoSumIndices(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            // If complement found, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store current element and index
            map.put(arr[i], i);
        }
        // No pair found
        return new int[] { -1, -1 };
    }



    public static void main(String[] args) {
       
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] res = twoSumIndices(arr, target);
        
        for(int n: res){
            System.out.print(n+" ");
        }
       
    }

    
}
