public class Q01_FactorialOfNum {

    static long factorial(int num){
    
        //base case
        if(num==0){
            return 1;
        }

        // recursive relation
        long ans=num*factorial(num-1);
        return ans;
    }

    public static void main(String[] args) {
        int num=5;
        long ans=factorial(num);
        System.out.println(ans);
    }
    
}
