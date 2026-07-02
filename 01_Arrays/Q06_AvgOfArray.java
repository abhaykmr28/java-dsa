public class Q06_AvgOfArray {
     static double getAvg(int arr[]){
        double sum=0;
        for(int val : arr){
            sum =sum+val;
        }

        int size= arr.length;
        double avg=sum/size;
        return avg;
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5};

        System.out.println(getAvg(arr));
     
}
}
