package OneDimensionArray;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 45, 9, 86, 7, 87, 56, 78 };
        int target = 43;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    System.out.println("true");
            }

        }
        System.out.println("false");
    }

}
