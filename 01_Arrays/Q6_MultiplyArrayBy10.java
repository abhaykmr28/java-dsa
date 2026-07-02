public class Q6_MultiplyArrayBy10 {
    // multiply arry by 10 
 
    static int[] multiplyBy10(int arr[]){
        int size=arr.length;
        int newArray[]=new int[size];
        for(int i=0; i<size; i++){
            int val=arr[i];
            int ans= val*10;
            newArray[i]=ans;
        }
        return newArray;

    }

    public static void main(String[] args) {
        
        int arr[]={2,3,5,9,12};
        int ans[]=multiplyBy10(arr);

        System.out.println("printing ans array");

        for(int i:ans){
            System.out.println(i);
        }

    }
    
    
}
