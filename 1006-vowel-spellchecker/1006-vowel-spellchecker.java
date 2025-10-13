import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelInsensitive = new HashMap<>();
        
        for (String w : wordlist) {
            String lower = w.toLowerCase();
            caseInsensitive.putIfAbsent(lower, w);
            vowelInsensitive.putIfAbsent(mask(lower), w);
        }
        
        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) ans[i] = q;
            else if (caseInsensitive.containsKey(q.toLowerCase())) ans[i] = caseInsensitive.get(q.toLowerCase());
            else ans[i] = vowelInsensitive.getOrDefault(mask(q.toLowerCase()), "");
        }
        return ans;
    }
    
    private String mask(String s) {
        return s.replaceAll("[aeiou]", "*");
    }
}
