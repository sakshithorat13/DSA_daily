class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int rightsum=0;
        int leftsum =0;
         for(int num:nums){
            rightsum += num;
         }
         for(int i=0;i<nums.length;i++){
            rightsum -= nums[i];
            ans[i]= Math.abs(leftsum - rightsum);
            leftsum += nums[i];
         }
        
        return ans;
    }
}