class Solution {
    public int longestPalindrome(String s) {
        int m= 0;
        Map<Character, Integer> count = new HashMap<>();
        for (char l : s.toCharArray()) {
            int lc = count.getOrDefault(l, 0);
            count.put(l, lc+1);
        }

        for (int a : count.values()) {
            m += (a / 2) * 2;
        }

        return (m < s.length() ? m+1 : m);
    }
}