class Solution {
    public int maxFreqSum(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int v = 0, c1 = 0;
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                v = Math.max(v, count[i]);
            } else {
                c1 = Math.max(c1, count[i]);
            }
        }
        return v + c1;
    }
}
