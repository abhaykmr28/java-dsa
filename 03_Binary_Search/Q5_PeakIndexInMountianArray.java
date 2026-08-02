public class Q5_PeakIndexInMountianArray {

    

    public int peakIndexInMountainArray(int[] arr) {

        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                ans = mid;   // optional
                e = mid;
            }
        }

        return s;   // ya return ans;
    }
}