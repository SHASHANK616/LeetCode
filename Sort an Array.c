/*Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible*/
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int comp(const void* a, const void* b) { return *(int*)a - *(int*)b; }
int* sortArray(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize;
    qsort(nums, numsSize, sizeof(int), comp);
    return nums;
}
