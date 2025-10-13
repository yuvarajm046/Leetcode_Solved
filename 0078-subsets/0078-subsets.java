class Solution {
    public void result (ArrayList ans , ArrayList temp , int index , int nums[])
    {   
        if(index == nums.length)
        {   ans.add(new ArrayList<>(temp));
            return ;
         }
         temp.add(nums[index]);
         result(ans , temp , index+1 , nums);
          temp.remove(temp.size()-1);
         result(ans , temp ,index+1, nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList <List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        result(ans , temp , 0 , nums);
        return ans;


    }
}