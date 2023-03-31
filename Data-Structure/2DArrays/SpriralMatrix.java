// Approach - simulation Approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) return result;

        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col - 1;

        // We start with the top-left corner of the matrix and move to the right until we reach the end of the row
        while(top <= bottom && left <= right){
            for(int i=left; i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top ;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
