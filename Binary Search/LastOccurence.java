package BinarySearch;

public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 5, 5, 6, 9, 12, 19, 25 };
        int lo = 0, hi = arr.length - 1;
        int target = 5;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                ans = mid; // store answer
                lo = mid + 1; // move left for first occurence

            } else if (arr[mid] < target)
                lo = mid + 1;
            else {
                hi = mid - 1;
            }
        }
        if (ans != -1)
            System.out.println(ans);
        else
            System.out.print("not found");
    }
}
