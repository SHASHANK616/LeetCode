/*
Given a 0-indexed string s, permute s to get a new string t such that:

All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
The vowels must be sorted in the nondecreasing order of their ASCII values. More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value than t[j].
Return the resulting string.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.
*/

class Solution {
    public String sortVowels(String s) {
        int len = s.length();
        List<Character> CharList = new ArrayList<Character>(); 
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(c == 'a' || c=='e' || c =='i' || c=='o' || c=='u' || 
             c == 'A' || c=='E' || c =='I' || c=='O' || c=='U'){
                CharList.add(c);
             }
        }
        Collections.sort(CharList);

        StringBuilder result = new StringBuilder();
        int index = 0;
        for(int i=0; i<len; i++){
             char c = s.charAt(i);
              if(c == 'a' || c=='e' || c =='i' || c=='o' || c=='u' || 
             c == 'A' || c=='E' || c =='I' || c=='O' || c=='U'){
                result.append(CharList.get(index++));
             }
             else{
                result.append(c);
             }
        }
        return result.toString();
    }
}
