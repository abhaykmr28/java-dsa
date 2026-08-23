public class Q02_powerofTwo {

    static int powerofTwo(int n){

        // base case

        if(n==0){
            return 1;
        }


        int ans=2*powerofTwo(n-1);
        return ans;

    }
    public static void main(String[] args) {
        int n= 4;
        int ans=powerofTwo(n);
        System.out.println(ans);
    }
    
}
