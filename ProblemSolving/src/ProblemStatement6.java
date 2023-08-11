import java.util.Arrays;

public class ProblemStatement6 {
    public static void printPascalTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print((i * (j - 1)) - 1 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void pascalTriangle(int row) {
        int arr[][] = new int[row][];

        for (int i = 0; i < row; i++) {
            arr[i] = new int[i + 1];
            if (i == 0) {
                arr[i] = new int[1];
                arr[i][0] = 1;
            } else {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j == 0 || j == i) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    }
                }
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] arrPascalTriangle(int row) {
        int arr[][] = new int[row][row * 2 - 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j >= row - i - 1 ? (j == row - i - 1 || j == (row - 1 + i)) ? 1 : 0 : 0;
                arr[i][j] = (j > row - i - 1 && j < row - 1 + i && arr[i][j - 1] == 0) ? arr[i - 1][j - 1] + arr[i - 1][j + 1] : arr[i][j];
            }
        }
        return arr;

    }


        public static void main (String[]args){
            int arr[][] = arrPascalTriangle(8);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
            }
        }

    }


/*  public static int[][] arrPascalTriangle(int row){
        int arr[][]=new int [row][row*2-1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                if(j>=row-i-1)
//                {
//                    if(j==row-i-1 || j==(row-1+i))
//                        arr[i][j]=1;
//                }
//                else
//                {
//                    arr[i][j]=0;
//                }
                arr[i][j]=j>=row-i-1?(j==row-i-1||j==(row-1+i))?1:0:0;
                if(j>row-i-1 && j<row-1+i){
                    if(arr[i][j-1]!=0){

                    }
                    else {
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j+1];
                    }
                }
            }
        }
        return arr;
    } */