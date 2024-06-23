/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

*/

int mySqrt(int x){

    if(x<2) return x;
    int max=x,min=1;

    while(min<=max){
        int mid= min+((max-min)/2);
        if(mid == x/mid) return mid;
        else if(mid < x/mid) min=mid+1;
        else max=mid-1;
    }
