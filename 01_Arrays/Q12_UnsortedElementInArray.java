public class Q12_UnsortedElementInArray {

    static int UnsotedElementInArray(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,9,5,10};
        int ans=UnsotedElementInArray(arr);
        System.out.println(ans);
        
    }
    
}
