package BinarySearch;

public class KthMissingPositiveNumberInArray {
       public int findKthPositive(int[] arr, int k) {
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int correct = mid + 1;  //correct which should be at that place in normal counting
            int missing = arr[mid] - correct;
            if(missing < k) lo = mid + 1;
            else hi = mid -1;
        }
        return hi + 1 + k;
    }
}
