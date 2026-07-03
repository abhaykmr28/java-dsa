public class Q09_FindMaximumInArray {

    static int findMax(int arr[]){
        int maxi=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,33,22,32,12,23};
        int ans=findMax(arr);
        System.out.println(ans);
    }
}
