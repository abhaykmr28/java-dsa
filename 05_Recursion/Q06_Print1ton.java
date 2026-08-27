public class Q06_Print1ton {

    static void printcounting(int n, int count){

        // base case

        if(count>n){
            return;
        }  
        System.out.println(count);
        count++;
        printcounting(n, count);
        
    }

    public static void main(String[] args) {
        int n=5;
        int count=1;
        printcounting(n, count);
    }
    
}
