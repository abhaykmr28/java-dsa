import java.util.HashMap;

public class Q20_GetModeOfArray {
    
    static int mode(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for (int num : arr) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int maxFreq = 0;
        int mode = arr[0];

        for (int key : map.keySet()) {

            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                mode = key;
            }
        }

        return mode;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 2, 4, 2, 5, 1};

        System.out.println(mode(arr));
    }
}
    

