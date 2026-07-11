import java.util.*;
public class Q27_FirstRepeatingElement {
     static int FirstRepeatingElement(int arr[]){

        HashMap<Integer, Integer> freq = new HashMap<>();

        // frequency Store 

        for(int num:arr){
         freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(int i:arr){
            if(freq.get(i)>1){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[]={10,5,3,4,3,5,9};
        int ans=FirstRepeatingElement(arr);
        System.out.println(ans);
    }

    
}
