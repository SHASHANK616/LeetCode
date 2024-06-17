//Given an integer x, return true if x is a palindrome, and false otherwise.

bool isPalindrome(int x) {
    long int reverse=0;
    int remainder;
    int y = x;
    while(y > 0){
        remainder=y%10;
        reverse = reverse*10+ remainder;
        y /=10;
    }
    if(x==reverse){
        return true;
    }
    else{
        return false;
    }
}
