/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.*/

class Solution {
    public int lengthOfLastWord(String s) {
      String k=s.trim();
      String f= k.substring(k.lastIndexOf(" ")+1);
      int g= f.length();
      return g;
    }
}
