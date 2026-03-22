class Solution {
    int numberOfOnes(int num){
        int c=0;
        while(num!=0){
            c = num%2==1?c+1:c;
            num/=2;
        }
        return c;
    }
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                int a= numberOfOnes(arr[j]);
                int b= numberOfOnes(arr[j+1]);
                if(a > b){
                    int sw = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = sw;
                }
                else if(a == b && arr[j]>arr[j+1]){
                    int sw = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = sw;
                }
            }
        }
        return arr;
    }
}