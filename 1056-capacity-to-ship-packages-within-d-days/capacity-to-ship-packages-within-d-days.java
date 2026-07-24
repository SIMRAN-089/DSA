class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int start = 0;
        int end = 0;

        // Search Space
        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]); // maximum weight
            end += weights[i];                   // sum of all weights
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int requiredDays = 1;
            int load = 0;

            for (int i = 0; i < weights.length; i++) {

                if (load + weights[i] <= mid) {
                    load += weights[i];
                } else {
                    requiredDays++;
                    load = weights[i];
                }
            }

            if (requiredDays > days) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}