/*You are given the array nums consisting of n positive integers. You computed the sum of all non-empty continuous subarrays from the array and then sorted them in non-decreasing 
order, creating a new array of n * (n + 1) / 2 numbers.
Return the sum of the numbers from index left to index right (indexed from 1), inclusive, in the new array. Since the answer can be a huge number return it modulo 109 + 7.*/

int comp(const void* a, const void* b) { return *(long long int*)a - *(long long int*)b; }
int rangeSum(int* nums, int numsSize, int n, int left, int right) {
    int k = n * (n + 1) / 2;
    long long int* arr = (long long int*)malloc(k * sizeof(long long int));
    int index = 0;
    for (int i = 0; i < numsSize; i++) {
       long long int temp = 0;
        for (int j = i; j < numsSize; j++) {
            temp += nums[j];
            arr[index++] = temp;
        }
    }
    qsort(arr, k, sizeof(long long int), comp);
    long long int sum = 0;
    for (int i = left - 1; i < right; i++) {
        sum += arr[i];
        left++;
    }
    return sum% 1000000007;
}
