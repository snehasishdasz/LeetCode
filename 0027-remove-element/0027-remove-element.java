class Solution {
    public int removeElement(int[] nums, int val) {
        int end = nums.length-1;
        int start = 0;
        while(start<=end){
            if(nums[end]==val){
                end--;
            }
            else{
                if(nums[start]==val){
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end]= temp;
                    start++;
                    end--;
                }else{
                    start++;
                }
            }
        }
        return end+1;
        
    }
}