import java.util.Arrays;

public class MatrixMultiplication {

    public static int[][] productOfMatrix(int[][] mat1 , int [][]mat2){
        int row,col;

            row = mat1.length;
            col = mat2[0].length;
        if(row==col) {
            int[][] ans = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int k = 0; k < ans[i].length; k++) {
                    int val = 0;
                    for (int j = 0; j < mat1[i].length; j++) {
                        val += mat1[i][j] * mat2[j][k];
                    }
                    ans[i][k] = val;
                }

            }
            return ans;
        }
        else
            return null;
    }

    public static void main(String[] args) {
        int [][]mat1={{1,2,3},{4,5,6}};
        int mat2[][]= {{7,9},{9,10},{11,12}};
        int [][]ans=productOfMatrix(mat1,mat2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
}
