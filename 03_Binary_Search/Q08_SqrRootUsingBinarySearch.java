public class Q08_SqrRootUsingBinarySearch {
    
static int Sqrt(int x){
    int s=0; // start 0 pe hai 
    int e=x;  // end x matlabhi usi gvien no. pe hai
    int ans=-1;

    while (s<e) {
        int mid=s+(e-s)/2;

        if(mid*mid==x){
            return mid;
        }

        else if(mid*mid>x){
            // ignore and move left
            e=mid-1;

        }

        else{
            // mid*mid <x
            // it may be the potential solution store it and move right because 
            // isse badi value sol hui toh vo right meehi milegi 
            ans=mid;
            s=mid+1;
        }
        
    }

    return ans;

}

public static void main(String[] args) {
    int x=56;
    int sqrrot=Sqrt(x);
    System.out.println(sqrrot);

}
}
