package TwoDimensionalArray;

import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 6;
        n--;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            list.add(a);
            for (int j = 0; j <= i; j++) {
                a.add(0);
                if (j == 0 || j == i)
                    list.get(i).set(j, 1);
                else
                    list.get(i).set(j, list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));

                // we can add elements like this also in pascal triangle i.e 2d arraylist
                // if (j == 0 || j == i) {
                // a.add(1);
                // } else {
                // a.add(
                // list.get(i - 1).get(j) +
                // list.get(i - 1).get(j - 1)
                // );

            }
        }


        // method 2 (for nth row prinitng of pascal triangle)
        // ArrayList<Integer> ans = new ArrayList<>();
        // int x = 1;
        // for(int r = 0; r<=n; r++){       //r = columns
        // ans.add(x);
        // x = (n-r)*x/(r+1);
        // }

        // printing whole pascal triangle
        for (ArrayList<Integer> row : list) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
