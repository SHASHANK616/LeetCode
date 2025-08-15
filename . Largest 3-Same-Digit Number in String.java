/*You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.
 

Example 1:

Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".*/

import java.util.*;
class Solution {
    public String largestGoodInteger(String num) {
        char best = 0;
        int n = num.length();
        for(int i=0; i<n-2; i++){
            char c = num.charAt(i);
            if(c==num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                if (c > best) best = c;
            }
        } 
        String s = String.valueOf(best);
        return best==0?"":s+s+s;
    }
}
