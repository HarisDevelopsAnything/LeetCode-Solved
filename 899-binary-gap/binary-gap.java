class Solution {
    String decToBin(int n){
        String res="";
        while(n!=0){
            int d= n%2;
            res= d+res;
            n/=2;
        }
        return res;
    }
    public int binaryGap(int n) {
        String bin = decToBin(n);
        int max = 0;
        int dist;
        int start=-1;
        int end =-1;
        int i=0;
        while(i<bin.length()){
            if(bin.charAt(i)=='1'){
                if(start==-1){
                    start = i;
                }
                else{
                    end = i;
                    dist = end-start;
                    if(max<dist) max=dist;
                    start = end;
                }
            }
            i++;
        }
        return max;
    }
}