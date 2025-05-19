class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];

        int row = mat.length;
        int col = mat[0].length;
        int[] result = new int[row * col];
        int r = 0, c = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = mat[r][c];

            // Moving up
            if ((r + c) % 2 == 0) {
                if (c == col - 1) r++;              // hit right border
                else if (r == 0) c++;               // hit top border
                else {
                    r--;
                    c++;
                }
            } 
            // Moving down
            else {
                if (r == row - 1) c++;              // hit bottom border
                else if (c == 0) r++;               // hit left border
                else {
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}
