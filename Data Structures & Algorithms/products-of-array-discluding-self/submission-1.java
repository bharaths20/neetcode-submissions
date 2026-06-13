class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes = 0;

        int[] ans = new int[nums.length];

        int prod = 1;

        for(int num : nums) {
            if(num == 0) zeroes++;
            else prod *= num;
        }
        if(zeroes > 1) {
            return ans;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(zeroes > 0) ans[i] = (nums[i] == 0) ? prod : 0;
            else ans[i] = prod / nums[i];
        }
        return ans;     
    }
}  
