class Solution {
        public int singleNumber(int[] n) {
        int o = 0;
        int t = 0;
        for(int i=0;i<n.length;i++){
            o = (n[i] ^ o) & (~t);
            t = (n[i] ^ t) & (~o);
        }
        return o;
         
    }
 }


        
   
