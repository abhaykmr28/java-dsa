public class Q09_AllocateMinimumPages {

    static boolean isValidAns(int arr[], int k, int mid) {

        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {

            // Agar current student ko ye book de sakte hain
            if (pages + arr[i] <= mid) {
                pages += arr[i];
            } else {
                // Naye student ko assign karo
                studentCount++;

                // Agar students zyada ho gaye ya ek book hi mid se badi hai
                if (studentCount > k || arr[i] > mid) {
                    return false;
                }

                pages = arr[i];
            }
        }

        return true;
    }

    static int findPages(int arr[], int k) {

        if (arr.length < k) {
            return -1;
        }

        int sum = 0;
        int max = 0;

        for (int x : arr) {
            sum += x;
            max = Math.max(max, x);
        }

        int s = max;
        int e = sum;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAns(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int k = 2;

        System.out.println(findPages(arr, k));
    }
}