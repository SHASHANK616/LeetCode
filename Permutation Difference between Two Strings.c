/*You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.

The permutation difference between s and t is defined as the sum of the absolute difference between the index of the occurrence of each character in s and the index of the occurrence of the same character in t.

Return the permutation difference between s and t.

 */
int findPermutationDifference(char* s, char* t) {
   int length = strlen(s);
    int sum = 0;
    int SIindex[256]={0};
    for(int i=0; i<length; i++){
        SIindex[(int)s[i]]=i;
    }

    for(int i=0; i<length; i++){
        sum += abs(i-SIindex[(int)t[i]]);
    }
    return sum;
}
