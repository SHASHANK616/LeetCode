/*Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity. */


int searchInsert(int* nums, int numsSize, int target) {
    int l=0;
    int h=numsSize-1;
    while(l<=h){
        int mid=(l+h)/2;
        if(nums[mid]<target){
            l=mid+1;
        }
        else if(nums[mid]>target){
            h=mid-1;
        }
        else {
            return mid;
        }
    }
    return l;
}
