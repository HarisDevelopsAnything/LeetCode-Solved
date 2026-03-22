import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int mindiff = Math.abs(arr[0] - arr[1]);
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
                if(mindiff > arr[i] - arr[i-1]) mindiff = Math.abs(arr[i]-arr[i-1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
                if(mindiff==arr[i]-arr[i-1]){
                    List<Integer> ele = new ArrayList<>();
                    ele.add(arr[i-1]);
                    ele.add(arr[i]);
                    res.add(ele);
                }
        }
        return res;
    }
}