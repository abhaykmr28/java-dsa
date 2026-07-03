public class Q08_LinerSearchInArray {


    static boolean LinearSearch(int arr[],int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==target){
                return true;

            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,22,34,22};
        int target = 6;
        boolean ans=LinearSearch(arr, target);
        System.out.println(ans);
        
    }
}
