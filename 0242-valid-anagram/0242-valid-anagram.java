class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;

        }
        char ch[] = s.toCharArray();
        char sd[]= t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(sd);
        return Arrays.equals(ch,sd);
        
    }
}