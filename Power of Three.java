/*Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

*/

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n%3 !=0 || n<2){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}
