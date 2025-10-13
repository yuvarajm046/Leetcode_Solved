
// class Solution {
//     public boolean doesAliceWin(String s) {
//         return s.chars().anyMatch(c -> "aeiou".indexOf(c) >= 0);
//     }
// }

class Solution{
    public boolean doesAliceWin(String s){
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                return true;
            }
        }
        return false;
    }
}