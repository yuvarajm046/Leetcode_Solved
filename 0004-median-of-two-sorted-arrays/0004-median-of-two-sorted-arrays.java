class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int r=nums1.length;
        int t=nums2.length;
        int[] s=new int[r+t];
        int k=0;
        for(int i=0;i<r;i++){
            s[k++]=nums1[i];

        }
        for(int j=0;j<t;j++){
            s[k++]=nums2[j];
        }

        Arrays.sort(s);
        int f=s.length;
        
            if(f%2!=0){
                int g=Math.round(f/2);
                return s[g];

            }
            else{
                int n=f/2;
                return (s[n]+s[n-1])/2.0;
            }

        
      
        
    }
}