package leetcode;

public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target){
        if (matrix == null) {
            return false;
        }

        int i = 0;
        int j = matrix[0].length - 1;
        boolean isFound = false;
        while (i < matrix.length && j >= 0){
            int currentNumber = matrix[i][j];
            if (currentNumber > target) {
                j--;
            } else if (currentNumber < target) {
                i++;
            } else {
                isFound = true;
                break;
            }
        }

        return isFound;
    }

    private static void test1() {
        int[][] matrix = {{1,3,5,7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target = 11;
        System.out.println(searchMatrix(matrix, target));// should be true
    }

    private static void test2() {
        int[][] matrix = {{1,3,5,7}, {10, 11, 16, 20}, {23, 30, 34, 50}};// should be false
        int target = 13;

        System.out.println(searchMatrix(matrix, target));
    }

    public static void main(String[] args) {
        test1();
        test2();
    }
}
