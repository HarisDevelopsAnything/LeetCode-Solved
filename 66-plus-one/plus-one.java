class Solution {
    public int[] plusOne(int[] digits) {
        int plus[] = new int[digits.length];
        int carry = 1;
        int sum =0;
        for(int i=digits.length-1;i>=0;i--){
            sum = digits[i]+carry;
            plus[i] = sum%10;
            carry = sum>9?1:0;
        }
        if(carry == 1){
            int newplus[] = new int[digits.length+1];
            newplus[0] = 1;
            for(int i=1;i<digits.length+1;i++){
                newplus[i] = plus[i-1];
            }
            return newplus;
        }
        return plus;
    }
}