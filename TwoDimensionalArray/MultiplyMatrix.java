package TwoDimensionalArray;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 4,2}, { 2, 5 ,8} };
        int[][] b = {{ 3, 6 }, { 10, 13 }, {5,4}};
        int m = a.length;
        int n = b[0].length;
        int p = a[0].length;         //p can be anything either columns of a or rows of b
        int[][] c = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){        //we can use n everywhere becoz m=n here in square matrix
                c[i][j] = 0;
                for(int k=0; k<p; k++){
                   c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        //printing array
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
