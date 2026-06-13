class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes = 0;
        int[] ans = new int[nums.length];
        for(int num : nums) {
            if(num == 0) zeroes++;
        }
        if(zeroes > 1) {
            Arrays.fill(ans, 0);
            return ans;
        }
        int prod = 1;
        for(int num : nums) {
            if(num != 0) prod *= num;
        }
        for(int i = 0; i < nums.length; i++) {
            if(zeroes > 0 && nums[i] == 0) ans[i] = prod;
            else if(zeroes > 0) ans[i] = 0;
            else ans[i] = prod / nums[i];
        }
        return ans;     
    }
}  
