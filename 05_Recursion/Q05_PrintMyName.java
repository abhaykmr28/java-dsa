public class Q05_PrintMyName {

    static void Printmyname(int n){

        // base case

        if(n==0){
            return ;
        }
        


        System.out.println("abhay");
        Printmyname(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        Printmyname(n);
    }
    
}
