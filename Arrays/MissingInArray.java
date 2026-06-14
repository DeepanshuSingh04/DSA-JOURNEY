package OneDimensionArray;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,4};
        long n = arr.length +1;      //adding this 1 becoz in gfg question sizze is n-1
        long sum1toN = (n*(n+1)/2);
        long arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }
        long missing = sum1toN - arraySum;
        System.out.println((int)missing);
    }
    
}
 
