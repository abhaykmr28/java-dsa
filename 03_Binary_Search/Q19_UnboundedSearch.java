class InfiniteArray {                           //
    private int[] arr;                          //
                                                //

    public InfiniteArray(int[] nums) {         //
        this.arr = nums;                       //
    }                                          //<----------------- Infinite array class
                                                //
    public int get(int index) {               //
        if (index >= arr.length) {            //
            return Integer.MAX_VALUE;        //
        }

        return arr[index];                   //
    }                                        //
}                                            //


public class Q19_UnboundedSearch {
    static int  unboundedSearch(InfiniteArray arr, int target){
        // cheking target 1st element hi oth nahi 

        if (arr.get(0)==target){
            return target;

        }

        // for BS , Find the range

        int i=1;
        while(arr.get(i)<=target){          // jab tak i<=target hai iko aage bdhate jayo 
            i=i*2;                            //agre i=i*2 se badyo exponentialy
        }

        if(arr.get(i)>target){
            int s=i/2;
            int e=i;

            while(s<=e){
                int mid=s+(e-s)/2;

                if(arr.get(mid)==target){
                    return mid;
                }

                else if(arr.get(i)>target){
                    // move to left
                    e=mid-1;
                }

                else{
                    s=mid+1;
                }
            }

            }
        

        else{
            // ki jab tak i<=target tha hamne bda diya i*2 se 
            // when i>taget hua, iss i pe e rkahu isse previous i pe s;
            // aar ye kuch nahi ho rha ho toh 
            return -1;
        }

        return -1;
    }
    
    
}
