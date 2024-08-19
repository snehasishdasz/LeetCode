class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        // Return the k-th largest element
        return nums[n - k];
    }
}