package TwoDimensionalArray;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] arr = {{6,9,6,2,4},{4,20,4,5,6},{3,4,5,67,5},{3,4,5,2,4}};
        int m = arr.length,  n = arr[0].length;
        for (int i=0; i<m; i++){
            if(i%2 == 0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
