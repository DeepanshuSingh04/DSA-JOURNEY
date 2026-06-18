package TwoDimensionalArray;

import java.util.ArrayList;

public class SpirallyTraversing {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 } };

        //we are making arraylist instead of 2d array list becoz in gfg question we have to answer only in single array not matrix
        ArrayList<Integer> ans = new ArrayList<>();
        int rows = arr.length, cols = arr[0].length;
        int sr = 0, er = rows - 1, sc = 0, ec = cols - 1;
        while (sr <= er && sc <= ec) {
            // start row
            for (int j = sc; j <= ec; j++) {
                ans.add(arr[sr][j]);
            }
            sr++;
            if(sr>er || sc>ec) break;
            // end col
            for (int i = sr; i <= er; i++) {
                ans.add(arr[i][ec]);
            }
            ec--;
             if(sr>er || sc>ec) break;
            // end row (reverse)
            for (int j = ec; j >= sc; j--) {
                ans.add(arr[er][j]);
            }
            er--;
            if(sr>er || sc>ec) break;
            // start col(reverse)
            for (int i = er; i >= sr; i--) {
                ans.add(arr[i][sc]);
            }
            sc++;
        }
        System.out.println(ans);
    }
}


//another method(just change the conditon of while and break)
// ArrayList<Integer> ans = new ArrayList<>();
//         int rows = arr.length, cols = arr[0].length;
//         int sr = 0, er = rows - 1, sc = 0, ec = cols - 1;
//         while (ans.size()<rows*cols) {
//             // start row
//             for (int j = sc; j <= ec; j++) {
//                 ans.add(arr[sr][j]);
//             }
//             sr++;
//             if(ans.size()>=rows*cols) break;
//             // end col
//             for (int i = sr; i <= er; i++) {
//                 ans.add(arr[i][ec]);
//             }
//             ec--;
//              if(ans.size()>=rows*cols) break;
//             // end row (reverse)
//             for (int j = ec; j >= sc; j--) {
//                 ans.add(arr[er][j]);
//             }
//             er--;
//             if(ans.size()>=rows*cols) break;
//             // start col(reverse)
//             for (int i = er; i >= sr; i--) {
//                 ans.add(arr[i][sc]);
//             }
//             sc++;
//         }
//         System.out.println(ans);
//     }
// }
