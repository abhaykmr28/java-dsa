public class Q5_PeakIndexInMountianArray {

    public int peakIndexInMountainArray(int[] arr) {

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak right side me hai
                s = mid + 1;
            } else {
                // Peak mid par ya left side me hai
                e = mid;
            }
        }

        return s; // s == e == peak index
    }
}
