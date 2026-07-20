import java.util.ArrayList;
import java.util.List;
public class Q38_BoundaryTravel {
    



    static List<Integer> boundaryTraversal(int[][] arr) {

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        // Top Row
        for (int col = 0; col < m; col++) {
            ans.add(arr[0][col]);
        }

        // Right Column
        for (int row = 1; row < n; row++) {
            ans.add(arr[row][m - 1]);
        }

        // Bottom Row
        if (n > 1) {
            for (int col = m - 2; col >= 0; col--) {
                ans.add(arr[n - 1][col]);
            }
        }

        // Left Column
        if (m > 1) {
            for (int row = n - 2; row >= 1; row--) {
                ans.add(arr[row][0]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(boundaryTraversal(arr));
    }
}
    

