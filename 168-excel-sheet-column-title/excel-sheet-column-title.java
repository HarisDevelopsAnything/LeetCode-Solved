class Solution {
    public String convertToTitle(int columnNumber) {
        String title="";
        while(columnNumber != 0){
            int d= (columnNumber-1)%26;
            title= (char)(d%26+65)+title;
            columnNumber = (columnNumber-1)/26;
        }
        return title;
    }
}