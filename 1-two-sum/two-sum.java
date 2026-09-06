import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int remain = target - nums[i];
        if(map.containsKey(remain)){//if remain exist in map then we return
            return new int[]{i,map.get(remain)};
        }
        map.put(nums[i],i);//otherwise we put it in the map
        // {2,7,11,15} 
        // map -> 2:0, 7 
      }
      return null;
      
    }
}
