public class Q11_Binarysearchbyrecursion {

    static int solve(int[] nums, int target, int s, int e) {

        // base case
        if (s > e) {
            return -1;
        }

        // find mid
        int mid = s + (e - s) / 2;

        // check target
        if (nums[mid] == target) {
            return mid;
        }

        // target left side mein hai
        if (nums[mid] > target) {
            e = mid - 1;
        }

        // target right side mein hai
        else {
            s = mid + 1;
        }

        // recursive call
        return solve(nums, target, s, e);
    }

    public int search(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;

        int sol = solve(nums, target, s, e);

        return sol;
    }
}
    

