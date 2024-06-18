//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
//The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

int removeDuplicates(int* nums, int numsSize) {
    int k=1;
    for(int i=0; i<numsSize; i++){
        if(nums[i] != nums[k-1]){
            nums[k]=nums[i];
            k++;
        }
    }
    return k;
}
