package OneDimensionArray;

public class RotateArray {

    // Function to reverse array from index i to j
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Function to rotate array by d elements
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;   // important for large d

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {23, 2, 34, 54, 224, 53, 54};
        int d = 2;

        rotateArr(arr, d);

        // Print rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
