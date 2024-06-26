/*Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) 
such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

 */

int comp(const void *a, const void *b){
    return (*(int*)a-*(int*)b);
}

int arrayPairSum(int* nums, int numsSize) {
    int k=0;
    qsort(nums, numsSize, sizeof(int), comp);
    for(int i=0;i<numsSize;i++)
    {
        if(i%2==0)
        k=k+nums[i];

    }
return k;
}
