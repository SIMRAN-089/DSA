class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j = 0;
        int n = nums.length;
        int maxcount = 0;
        int currentcount = 0;
        while(j<n){
            if(nums[j]==1){
                currentcount++;
            } else{
                maxcount = Math.max(maxcount,currentcount);
                currentcount = 0;

            }
            j++;
        }
        return Math.max(maxcount,currentcount);
        
    }
}