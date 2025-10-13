class Solution {
    public boolean isValid(String word) {
        char[] ch = word.toCharArray();
        if(ch.length<3)
            return false;

        int v=0,c=0;
        for(char i: ch){
            if(Character.isLetter(i)){
                if("aeiouAEIOU".indexOf(i)!=-1){
                    v++;
                }
                else
                c++;
            }
            else if(!Character.isDigit(i))
            return false;
        }
        if(v == 0 || c ==0)
        return false;
        return true; 
    }
}