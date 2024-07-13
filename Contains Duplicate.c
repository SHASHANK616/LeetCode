/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.*/

int comp(const void* a, const void* b){
    return (*(int*)a - *(int*)b);
}

bool containsDuplicate(int* nums, int numsSize) {
    qsort(nums, numsSize, sizeof(int), comp);
    for(int i=1; i<numsSize; i++){
        if(nums[i]==nums[i-1]){
            return true;
        }
    }
    return false;
}
