class Solution {
    int[][] rotateMat(int[][] mat, int rows, int cols){
        int res[][] = new int[rows][cols];
        int r = rows-1;
        int c = 0;
        for(int i=0;i<rows;i++){
            r = rows-1;
            for(int j=0;j<cols;j++){
                res[i][j] = mat[r][c];
                r--;
            }
            c++;
        }
        return res;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int k=0;k<4;k++){
            mat = rotateMat(mat, mat.length, mat.length);
            int match = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j] == target[i][j]) match++;
                }
            }
            if(match==n*n) return true;
        }
        return false;
    }
}