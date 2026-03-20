bool isPalindrome(int x) {
    int temp = x,d;
    unsigned int r=0;
    if (x<0) return false;
    while(x!=0){
        d=x%10;
        r=r*10+d;
        x/=10;
    }
    return r==temp;
}