class Solution {
    public List<Integer> maxActiveSectionsAfterTrade(String s, int[][] queries) {
        int n = s.length();
        int ones = 0;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == '1') ones++;

        List<int[]> zeroGroups = new ArrayList<>(); // {start, length}
        int[] zeroGroupIndex = new int[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (i > 0 && s.charAt(i - 1) == '0') {
                    int[] last = zeroGroups.get(zeroGroups.size() - 1);
                    last[1]++;
                } else {
                    zeroGroups.add(new int[]{i, 1});
                }
            }
            zeroGroupIndex[i] = zeroGroups.size() - 1;
        }
        List<Integer> answer = new ArrayList<>();

        if (zeroGroups.isEmpty()) {
            for (int i = 0; i < queries.length; i++) answer.add(ones);
            return answer;
        }

        int m = zeroGroups.size() - 1;
        int[] adjSums = new int[Math.max(m, 1)];
        for (int i = 0; i < m; i++)
            adjSums[i] = zeroGroups.get(i)[1] + zeroGroups.get(i + 1)[1];

        buildSparseTable(adjSums, m);

        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];

            int lGroupIdx = zeroGroupIndex[l];
            int rGroupIdx = zeroGroupIndex[r];

            int left = (lGroupIdx == -1) ? -1
                    : (zeroGroups.get(lGroupIdx)[1] - (l - zeroGroups.get(lGroupIdx)[0]));
            int right = (rGroupIdx == -1) ? -1
                    : (r - zeroGroups.get(rGroupIdx)[0] + 1);

            int rightBoundGroup = (s.charAt(r) == '1') ? rGroupIdx : rGroupIdx - 1;

            int startAdj = lGroupIdx + 1;
            int endAdj = rightBoundGroup - 1;

            int activeSections = ones;

            if (s.charAt(l) == '0' && s.charAt(r) == '0' && lGroupIdx + 1 == rGroupIdx) {
                activeSections = Math.max(activeSections, ones + left + right);
            } else if (startAdj <= endAdj && m > 0) {
                activeSections = Math.max(activeSections, ones + queryMax(startAdj, endAdj));
            }

            if (s.charAt(l) == '0' && lGroupIdx + 1 <= rightBoundGroup) {
                activeSections = Math.max(activeSections,
                        ones + left + zeroGroups.get(lGroupIdx + 1)[1]);
            }

            if (s.charAt(r) == '0' && lGroupIdx < rGroupIdx - 1) {
                activeSections = Math.max(activeSections,
                        ones + right + zeroGroups.get(rGroupIdx - 1)[1]);
            }
            answer.add(activeSections);
        }
        return answer;
    }

    private int[][] st;

    private void buildSparseTable(int[] nums, int m) {
        int n = nums.length;
        int k = 1;
        while ((1 << k) <= n) k++;
        k += 1;
        st = new int[k][n];
        for (int j = 0; j < n; j++) st[0][j] = nums[j];
        for (int i = 1; (1 << i) <= n; i++) {
            for (int j = 0; j + (1 << i) <= n; j++) {
                st[i][j] = Math.max(st[i - 1][j], st[i - 1][j + (1 << (i - 1))]);
            }
        }
    }

    private int queryMax(int l, int r) {
        int len = r - l + 1;
        int i = 31 - Integer.numberOfLeadingZeros(len);
        return Math.max(st[i][l], st[i][r - (1 << i) + 1]);
    }
}