public class Q43_LeftRoateByone { 
    
    static void LeftRotateByone(int arr[]){
        int n=arr.length;
        int temp=arr[0];
        int i=0;
        while (i<n-1) {
            arr[i]=arr[i+1];
            i++;

            
        }
         arr[n-1]=temp;


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        LeftRotateByone(arr);

        for(int val:arr){
            System.out.print(val+" ");
        }
        
    }
   
}

    

