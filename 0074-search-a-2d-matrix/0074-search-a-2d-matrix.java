class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Binary search for the correct row
        int top = 0;
        int bot = matrix.length - 1;

        while (top <= bot) {

            int mid = top + (bot - top) / 2;

            if (matrix[mid][0] <= target &&
                matrix[mid][matrix[mid].length - 1] >= target) {

                // Target can be present in this row
                return searchInRow(matrix[mid], target);

            } 
            else if (matrix[mid][0] > target) {

                bot = mid - 1;

            } 
            else {

                top = mid + 1;
            }
        }

        return false;
    }

    private boolean searchInRow(int[] row, int target) {

        int left = 0;
        int right = row.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (row[mid] == target) {
                return true;
            }
            else if (row[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return false;
    }
}