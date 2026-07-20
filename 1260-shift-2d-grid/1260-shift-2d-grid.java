class Solution {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;    // no. of rows
        int c = grid[0].length; // no. of cols
        int n = r * c;        //total elements

        k = k % n;      //reducing shifts

        reverse(grid, 0, n - 1, c);
        reverse(grid, 0, k - 1, c);
        reverse(grid, k, n - 1, c);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                row.add(grid[i][j]);
            }
            ans.add(row);
        }
        return ans;
    }

    private void reverse(int[][] grid, int left, int right, int c) {
        while (left < right) {
            int r1 = left / c;  //imp formula
            int c1 = left % c;  //imp formula

            int r2 = right / c;
            int c2 = right % c;

            int temp = grid[r1][c1];
            grid[r1][c1] = grid[r2][c2];
            grid[r2][c2] = temp;

            left++;
            right--;
        }
    }
}