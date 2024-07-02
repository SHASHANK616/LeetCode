/*You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

Return the minimum number of operations to make all elements of nums divisible by 3.*/

int minimumOperations(int* nums, int numsSize) {
    int count=0;
    for(int i=0; i<numsSize; i++){
        if(nums[i]%3 !=0){
            count +=1;
        }
    }
    return count;
}
