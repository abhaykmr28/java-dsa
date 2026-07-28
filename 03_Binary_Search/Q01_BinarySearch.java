public class Q01_BinarySearch {
     public int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        int mid = start + (end - start) / 2;

        while (start <= end) {

            // Target found
            if (arr[mid] == target) {
                return mid;
            }

            // Go to right half
            else if (target > arr[mid]) {
                start = mid + 1;
            }

            // Go to left half
            else {
                end = mid - 1;
            }

            // Update mid
            mid = start + (end - start) / 2;
        }

        return -1;
    }
}
    

