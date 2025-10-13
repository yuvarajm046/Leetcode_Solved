class Solution {
    public int thirdMax(int[] n) {
        Arrays.sort(n);
        if(n.length<3)return n[n.length-1];
        int s=1;
        for(int i=n.length-1;i>0;i--)
        {

            if(n[i]-n[i-1]!=0)s++;
            if(s==3)return n[i-1];
        }
        return n[n.length-1];

    }
}