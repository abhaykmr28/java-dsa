public class Q2_SelectionSort {

    static void Selectionsort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int MinIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[MinIndex]) {
                    MinIndex = j;
                }
            }

            // Swap after finding minimum
            int temp = arr[i];
            arr[i] = arr[MinIndex];
            arr[MinIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 6, 4, 1, 3};

        Selectionsort(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}