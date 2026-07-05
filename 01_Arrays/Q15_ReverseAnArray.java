public class Q15_ReverseAnArray {

static void ReverseArray(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;

        while (i<=j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        

    }
    public static void main(String[] args) {

        int arr[]={2,4,6,8,9};
        ReverseArray(arr);
        for(int k:arr){
        System.out.print(k+" " );
        }
        
    }
    
    
}
