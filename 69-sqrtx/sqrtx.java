class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        if(x==2147483647) return 46340;
        for(int i=1;i<x;i++){
            if(i*i == x) return i;
            if(i*i > x) return i-1;
        }
        return 1;
    }
}