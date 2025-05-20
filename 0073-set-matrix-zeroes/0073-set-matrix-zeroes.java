class Solution {
    public void setZeroes(int[][] matrix) {
    boolean frow = false ,fcol = false;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                if(i==0) frow = true;
                if(j==0) fcol = true;
                matrix[0][j] = 0;
                matrix[i][0] = 0; 
            }
        }
    }
    for(int i = 1;i<matrix.length;i++){
        for(int j=1;j<matrix[0].length;j++){
            if(matrix[i][0]==0 || matrix[0][j]==0){
                matrix[i][j]=0;
            }
        }
    }
    if(frow){
        for(int j=0;j<matrix[0].length;j++){
            matrix[0][j]=0;
        }
    }
    if(fcol){
        for(int i=0;i<matrix.length;i++){
            matrix[i][0]=0;
        }
    }
}}