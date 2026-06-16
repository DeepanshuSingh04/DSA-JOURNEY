package TwoDimensionalArray;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] arr = {{6,9,6,2},{4,20,4,5},{3,4,5,67},{3,4,5,2}};
        //transpose 
        for(int i=1; i<arr.length; i++){
           for(int j=0; j<i; j++){
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }
        //reverse each column
        for( int col=0; col<arr[0].length; col++){
            int i=0, j=arr.length-1;
            while(i<j){                   //i and j are rows
               int temp = arr[i][col];   //col remains same
               arr[i][col] = arr[j][col];
               arr[j][col] = temp;
               i++;
               j--;
            }
        }
        for(int i=0; i<arr.length; i++){
        for(int j =0; j<arr[0].length ; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
    }
}
