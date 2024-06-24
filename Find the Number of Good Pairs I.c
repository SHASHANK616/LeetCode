/*You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively. You are also given a positive integer k.

A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).

Return the total number of good pairs.*/

int numberOfPairs(int* nums1, int nums1Size, int* nums2, int nums2Size, int k) {
    int ans=0;
    for(int i=0; i<nums1Size; i++){
        for(int j=0; j<nums2Size; j++){
            if(nums1[i]%(nums2[j]*k)==0){
                ans++;
            }
        }
    }
    return ans;
}
