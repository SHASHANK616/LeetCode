//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
int reverse(int x){
    double remainder, reverse =0;
    while(x != 0){
        remainder = x%10;
        reverse = reverse*10+ remainder; 
        x /=10;
    }
    if(reverse > INT_MAX || reverse < INT_MIN){
        return 0;
    }
    return reverse;
}
