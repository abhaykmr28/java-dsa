public class Q41_RemoveDuplicate {
    
    static int removeDuplicates(int arr[]){
        int i=0;
      
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                ++i;
                arr[i]=arr[j];

            }

        }
        
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2};
        int ans=removeDuplicates(arr);
        System.out.println(ans);
    }
    
}
