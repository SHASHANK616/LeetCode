/*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.*/

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize) {
    int* ans = (long int*)malloc(sizeof(long int) * (2*numsSize));
    *returnSize = 2 * numsSize;
    for(int i=0; i< numsSize; i++){
        ans[i]=nums[i];
    }
        for(int i=0; i< numsSize; i++){
        ans[i+numsSize]=nums[i];
    }
    return ans;
    
}
