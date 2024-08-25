/*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 */

class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp = temp / 10;
            }
            num = sum;
        }
        return num;
    }
}
