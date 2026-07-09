public class Q22_MissingElementInArray {
       static int  missingNum(int arr[]){
        int xornum=0;
         for(int n:arr){
            xornum=xornum^n;
         }

         int n=arr.length;


         for(int i=0; i<=n; i++){
            xornum=xornum^i;
         }


         return xornum;
    }


    public static void main(String[] args) {
        int arr[]={0,1,3,4,5};
       

        System.out.println(missingNum(arr));
    }
    
}

    

