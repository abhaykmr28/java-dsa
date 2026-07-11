public class Q26_REmoveDuplicate {
    static int RemoveDuplicates(int arr[]){

        int i=0;
        int j=i+1;
        int n= arr.length;

        while (j<n) {
            if (arr[i]==arr[j]){
                j++;
            }
            else{
                // not match case 
                i++;
                arr[i]=arr[j];
                j++;

            }
            
        }

        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,3,3,4,4,4};
        int ans=RemoveDuplicates(arr);
        System.out.println(ans);
    }
    
    
}
