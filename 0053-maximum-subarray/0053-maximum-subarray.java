class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int maxNew = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            maxNew = maxNew + nums[i];
            if(maxSum < maxNew){
                maxSum = maxNew;
            }
            if(maxNew < 0){
                maxNew = 0;
            }
        }
        return maxSum;
    }
}