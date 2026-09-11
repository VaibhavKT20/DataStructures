class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxOne=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                maxOne=Math.max(maxOne,count);
                count=0;
            }
        }
        return Math.max(maxOne,count);
    }
}