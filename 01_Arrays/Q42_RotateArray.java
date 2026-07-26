public class Q42_RotateArray {
    static void rightshift(int arr[],int k){
        int n=arr.length;
        int []temp=new int[k];
        int j=0;
        for(int i=n-k; i<n;i++){
            temp[j]=arr[i];
            j++;
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for(int i=0; i<k;i++){
            arr[i]=temp[i];
        }
    }
       

    
}
