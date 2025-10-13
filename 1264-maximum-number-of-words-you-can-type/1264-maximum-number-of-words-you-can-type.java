class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int c1 =0;
        for (String w : words) {
            boolean b = true;
            for (char c : brokenLetters.toCharArray()) {
                if (w.indexOf(c) != -1) {
                    b = false;
                    break;
                }
            }if(b) c1++;
            
        }
        return c1
        ; 
    }
}

