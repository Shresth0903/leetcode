class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int hi = numbers.length - 1;
        
        while(low < hi){
            int total = numbers[low] + numbers[hi];

            if(total == target){
                return new int[]{low + 1, hi + 1};
            }
            else if(total > target){
                hi--;
            }
            else{
                low++;
            }
        }   
        return new int[]{-1,-1};     
    }
}