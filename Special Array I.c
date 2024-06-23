/*An array is considered special if every pair of its adjacent elements contains two numbers with different parity.

You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.*/

bool isArraySpecial(int* nums, int numsSize) {

    for(int i=0; i<numsSize-1; i++){
            if(numsSize==1){
        return true;
    }
            else {
                if(nums[i]%2==0 && nums[i+1]%2==0){
                return false;
            }
            else if(nums[i]%2!=0 && nums[i+1]%2!=0){
                return false;
            }
    }
    }
    
        return true;
}
