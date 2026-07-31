class Solution {
    public int minimumPushes(String word) {
// Step 1: Frequency count karo
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

// Step 2: Descending order mein sort karo
        Arrays.sort(freq);
        // Java sort ascending karta hai, isliye reverse karna padega
        for (int i = 0, j = 25; i < j; i++, j--) {
            int temp = freq[i];
            freq[i] = freq[j];
            freq[j] = temp;
        }
        int totalPushes = 0;
        int i = 0;

// Step 3: Groups of 8 banao, push count assign karo
        while (i < 26 && freq[i] > 0) {
            int pushCount = (i / 8) + 1; // har 8 letters ke baad push count +1
            totalPushes += freq[i] * pushCount;
            i++;
        }
        return totalPushes;
    }
}