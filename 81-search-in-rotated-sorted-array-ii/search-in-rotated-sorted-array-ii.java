class Solution {

    public boolean search(int[] nums, int target) {

        int pivot = findPivotWithDuplicates(nums);

        // Array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Pivot itself is the target
        if (nums[pivot] == target) {
            return true;
        }

        // Search in left half
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Search in right half
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int findPivotWithDuplicates(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                // Check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Left side is sorted, so pivot is on right
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }

            // Right side is sorted, so pivot is on left
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    boolean binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}