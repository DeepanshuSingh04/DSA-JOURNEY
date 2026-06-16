package TwoDimensionalArray;

public class RowWithMaximumSum {
    public static void main(String[] args) {
        int[][] arr = {{6,9,6,2,4},{4,20,4,5,6},{3,4,5,67,5},{3,4,5,2,4}};
        int m = arr.length; //rows
        int n = arr[0].length; //columns
        int maxSum = Integer.MIN_VALUE;
        int row = 0;
        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum+= arr[i][j];
            }
            if(sum>maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(maxSum + " " + row);
    }
}
