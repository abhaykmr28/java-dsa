public class Q3_InsertionSort {
    static void insertionSort(int arr[]) {

    int n = arr.length;

    for (int i = 1; i < n; i++) {

        int curr = i;
        int prev = i - 1;
        int currValue = arr[i];

        // Shifting
        while (prev >= 0 && currValue < arr[prev]) {
            arr[prev + 1] = arr[prev];
            prev--;
        }

        // Insert current value
        arr[prev + 1] = currValue;
    }
}
public static void main(String[] args) {
    
    int arr[]={5,4,2,1,3};
    insertionSort(arr);
    for(int val:arr){
        System.out.print(val+" ");
    }
    }
    
}
