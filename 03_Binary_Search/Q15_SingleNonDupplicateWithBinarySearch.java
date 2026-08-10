public class Q15_SingleNonDupplicateWithBinarySearch {
     public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            // Only one element is remaining
            if (s == e) {
                return nums[s];
            }

            int currentvalue = nums[mid];

            int previousvalue = -1;

            if (mid - 1 >= 0) {
                previousvalue = nums[mid - 1];
            }

            int nextvalue = -1;

            if (mid + 1 < n) {
                nextvalue = nums[mid + 1];
            }

            // mid itself is the single element
            if (currentvalue != previousvalue &&
                currentvalue != nextvalue) {

                return currentvalue;
            }

            // mid is the FIRST element of a pair
            // Example: 30 40 40
            //             ^
            if (currentvalue != previousvalue &&
                currentvalue == nextvalue) {

                int startingindexofpair = mid;

                // Pair starts at odd index
                // Single element is on the left
                if ((startingindexofpair & 1) == 1) {
                    e = mid - 1;
                }

                // Pair starts at even index
                // Single element is on the right
                else {
                    s = mid + 1;
                }
            }

            // mid is the SECOND element of a pair
            // Example: 40 40 50
            //          ^
            else if (currentvalue == previousvalue &&
                     currentvalue != nextvalue) {

                int endingindex = mid;

                // Pair ends at odd index
                // Single element is on the right
                if ((endingindex & 1) == 1) {
                    s = mid + 1;
                }

                // Pair ends at even index
                // Single element is on the left
                else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }

}