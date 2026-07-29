class Solution {
    private static final long CAP = 2_000_000_000L; // max possible k se bada sentinel

    public String smallestPalindrome(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        char mid = 0;
        boolean hasMid = false;
        int[] half = new int[26];
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                hasMid = true;
                mid = (char) ('a' + i);
            }
            half[i] = freq[i] / 2;
        }

        int halfLen = n / 2;
        long kk = k; // long me kaam karenge internally

        long total = countPermutations(half);
        if (kk > total) return "";

        StringBuilder sb = new StringBuilder();
        for (int pos = 0; pos < halfLen; pos++) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0) continue;
                half[c]--; // ye character use karke dekhte hain
                long cnt = countPermutations(half);
                if (kk <= cnt) {
                    sb.append((char) ('a' + c));
                    break; // is position ke liye character fix ho gaya
                } else {
                    kk -= cnt;
                    half[c]++; // wapas restore kar, ye character kaam ka nahi tha
                }
            }
        }

        String halfStr = sb.toString();
        StringBuilder result = new StringBuilder(halfStr);
        if (hasMid) result.append(mid);
        result.append(new StringBuilder(halfStr).reverse());
        return result.toString();
    }

    // half multiset ke distinct permutations count karta hai (capped)
    private long countPermutations(int[] cnt) {
        long result = 1;
        long placed = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 1; j <= cnt[i]; j++) {
                placed++;
                result = result * placed / j;   // incremental multinomial coefficient
                if (result > CAP) return CAP;
            }
        }
        return result;
    }
}