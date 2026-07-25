public class Q39_SecondLargest {
    

    static int secondLargest(int[] arr) {

        if (arr.length < 2) {
            return -1; // Array should have at least 2 elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // If no second distinct largest exists
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 4};

        int ans = secondLargest(arr);

        if (ans == -1) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second Largest = " + ans);
        }
    }
}
    

    

