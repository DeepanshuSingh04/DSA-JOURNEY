package TwoDimensionalArray;

public class SnakePrinting2 {
    public static void main(String[] args) {
        int[][] arr = {{6,9,6,2,4},{4,20,4,5,6},{3,4,5,67,5},{3,4,5,2,4}};
        int m = arr.length,  n = arr[0].length;
        for (int j=0; j<n; j++){
            if(j%2 == 0){
                for(int i=m-1; i>=0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int i=0; i<m; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
