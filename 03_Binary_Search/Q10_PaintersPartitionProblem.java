public class Q10_PaintersPartitionProblem {
    

    static boolean isValidSolution(int boards[], int k, int maxLength) {

        int painterCount = 1;
        int paintedLength = 0;

        for (int i = 0; i < boards.length; i++) {

            if (paintedLength + boards[i] <= maxLength) {
                // assign board to current painter
                paintedLength = paintedLength + boards[i];
            }

            else {
                // paintedLength + boards[i] > maxLength
                // limit breach

                painterCount++;
                paintedLength = 0;

                if (painterCount > k || boards[i] > maxLength) {
                    return false;
                }

                else {
                    // na toh painterCount me koi dikkat hai
                    // na toh maxLength me koi dikkat aayi hai
                    // assign current board to current painter

                    paintedLength = paintedLength + boards[i];
                }
            }
        }

        return true;
    }

    static int minTime(int[] boards, int k) {

        int n = boards.length;

        // not enough boards
        if (k > n) {
            return -1;
        }

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        // find search space
        for (int i = 0; i < n; i++) {
            sum += boards[i];
            maxi = Math.max(maxi, boards[i]);
        }

        int start = maxi;
        int end = sum;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValidSolution(boards, k, mid)) {
                // possible answer
                ans = mid;

                // try to minimize answer
                end = mid - 1;
            }

            else {
                // not possible
                // search on right side
                start = mid + 1;
            }
        }

        return ans;
    }
}
    

