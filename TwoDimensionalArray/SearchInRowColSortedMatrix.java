package TwoDimensionalArray;

import java.util.Scanner;

public class SearchInRowColSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target");
        int target = sc.nextInt();
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 } };

        // linear search (T.C = O(m*n))
        // for(int i=0; i<arr.length; i++){
        // for(int j=0; j<arr[0].length; j++){
        // if(arr[i][j] == target)
        // System.out.println("true");
        // }
        // }

        int m = arr.length, n = arr[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (arr[i][j] > target) // go left
                j--;
            else if (arr[i][j] < target) // go down
                i++;
            else{
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
