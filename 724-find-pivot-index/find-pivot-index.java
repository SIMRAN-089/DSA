class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;

        // Total sum
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int left = 0;

        // Check index 0 also
        if (left == sum - nums[0]) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            left += nums[i - 1];

            int right = sum - nums[i] - left;

            if (left == right) {
                return i;
            }
        }

        return -1;
    }
}