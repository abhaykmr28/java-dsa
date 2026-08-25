public class Q03_fibanacciseries {

    static int fib(int n){

        // base case

        if(n==0){
            return 0;

        }

        if(n==1){
            return 1;
        }


        //recursiv relation

        int ans=fib(n-1)+fib(n-2);
        return ans;
    }

    public static void main(String[] args) {
        int n=4;
        int ans=fib(n);
        System.out.println(ans);
    }
    
}
