public class Q07_Printarray {

    static void printarray(int[]arr,int i){
        int m=arr.length;
    
        // base case
       if(i>m){
        return;
       }

       System.out.println(arr[i]);
       i++;
       printarray(arr,i);

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int i=0;
        printarray(arr, i);
    }
}
