public class Q16_RightShiftByOne {
     //Step 1  store last index value in temp variable;
    // step 2 shift all value of array
    // step 3 copying value of temp at first

    static void RightShiftByOne (int arr[]){
        int n=arr.length;
        int temp=arr[n-1];
        int i=n-1;
        while (i>0) {
            arr[i]=arr[i-1];
            i--;
        }

        // for(int i=n-1; i>0 ;i--){
        //     arr[i]=arr[i-1];
        // }
          arr[0]=temp;
       
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        RightShiftByOne(arr);
       
        for(int j:arr){
            System.out.println(j);
        }
        
    }
    

    
}
