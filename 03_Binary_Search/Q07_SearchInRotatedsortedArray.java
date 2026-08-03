public class Q07_SearchInRotatedsortedArray {
    
    static int pivotIndex(int arr[]){
        int s=0;
        int n= arr.length;
        int e=n-1;
        int ans=-1;

        if(arr[s]<arr[e]){
            return -1;

        }
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]<=arr[n-1]){     // means ,mid on L1
                e=mid-1;               // move to left 

            }

            else{
                // in else case .
                // thats means arr[mid]>=arr[e]
                // thsi mid may be potential solution 
                // store this index;
                ans=mid;
                // move to right 
                s=mid+1;
                
            }
        }
        return ans;
    }

    static int binarySearch(int arr[],int s, int e, int target){
       
    while (s<=e) {
        int mid=s+(e-s)/2;

        if(arr[mid]==target){
            return mid;

        }

        else if(arr[mid]>target){
            e=mid-1;
        }

        else{
            s=mid+1;
        }
    }    
    return -1; 
    }

 static int search(int arr[],int target){
    int pivot=pivotIndex(arr);
    int n= arr.length;
    // edge case agar pivot index-1; retrun hui ho matlab array soreted hi ho 
    // normal binary search lg jayega

    if(pivot==-1){
      
        int ans=binarySearch(arr,0,n-1,target);
        return ans;
    }

    else{
        // array is not sorted matlab  fir rotated sorted given hai 
        // array can bve divided into l1 and l2 wala logic

   
    // indexes for l1 part
    int startarr1=0;
    int endsarr1=pivot;

    if(target>=arr[startarr1]&& target<=arr[endsarr1] ){
        int ans=binarySearch(arr, startarr1, endsarr1, target);
        return ans;

    }

    // indexes for l2 wala part
    int startarr2=pivot+1;
    int endsarr2=n-1;
    if(target>=arr[startarr2]&& target<=arr[endsarr2]){
        int ans=binarySearch(arr, startarr2, endsarr2, target);
        return ans;
    }


 }
 return -1;

  }
    
  public static void main(String[] args) {

    int arr[] = {50, 60, 70, 10, 20, 30, 40};

    System.out.println(search(arr, 50)); // 0
    System.out.println(search(arr, 70)); // 2
    System.out.println(search(arr, 10)); // 3
    System.out.println(search(arr, 20)); // 4
    System.out.println(search(arr, 40)); // 6
    System.out.println(search(arr, 100)); // -1
}
}

    

