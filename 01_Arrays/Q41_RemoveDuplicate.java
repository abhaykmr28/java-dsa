public class Q41_RemoveDuplicate {
    
    static int removeDuplicates(int arr[]){
        int i=arr[0];
      
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];

            }

        }
        
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,4,5,5,6};
        int ans=removeDuplicates(arr);
        System.out.println(ans);
    }
    
}
