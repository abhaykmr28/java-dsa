public class Q23_UniqueElementInArray {
    static int Uniqueelement(int arr[]){
        int xornum=0;

        for(int n: arr){
            xornum=xornum^n;
        }

        return xornum;
    }
    public static void main(String[] args) {
        

        int arr[]={2,3,4,5,2,3,4};
        System.out.println(Uniqueelement(arr));
    }
    
}
