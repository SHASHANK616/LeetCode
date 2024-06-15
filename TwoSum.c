//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i = 0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
    }
}
