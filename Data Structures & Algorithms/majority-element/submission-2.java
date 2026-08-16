class Solution {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == num && count != 0) {
                count++;
            }
            else if(count > 0 && nums[i] != num) {
                count--;
            }
            else {
                num = nums[i];
                count = 1;
            }
        }
        return num;
    }
}