
public class Q1_BubbleSort {

    static void BubbleSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 6, 4, 1};

        BubbleSort(arr);

        System.out.println("Printing the array:");

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}