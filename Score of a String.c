/*You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.*/

int scoreOfString(char* s) {
    int result=0;
    for (int i = 0; i < strlen(s) - 1; i++) {
        result =result+ fabs(s[i] - s[i + 1]);
    }
    return result;
}
