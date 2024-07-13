/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.*/

void sortColors(int* nums, int numsSize) {
    int temp;
    int swapped;
    for (int i = 0; i < numsSize - 1; i++) {
        swapped = 0;
        for (int j = 0; j < numsSize - i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
                swapped = 1;
            }
        }
        if (!swapped)
            break;
    }
}
