class Solution {
        public List<Integer> majorityElement(int[] nums) {
         Arrays.sort(nums);
         List<Integer> list = new ArrayList<>();
         int j = 0;
         while (j < nums.length){
         int x = nums[j];
         int count = 0;
         while (j < nums.length && nums[j] == x) {
            count++;
            j++;
          }
           if(count > nums.length / 3) {
                                                                                                                                      list.add(x);
                                                                                                                                }
                                                                                                                                }
                                                                                                                                return list;
                                                                                                                               }
                                                                                                                             }


        
 
