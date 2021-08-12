package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // Example Matrix
    int[][][] matrixvalues = {
            {
                    {4, 9, 7},
                    {8, 3, 2},
                    {5, 6, 1}
            },
            {
                    {180, 200, 220},
                    {250, 300, 350},
                    {400, 500, 600},
                    {1000, 1200, 1400}
            }
    };

    ArrayList<Matrix> matrixen = new ArrayList<>();

    Main() {
        for (int[][] matrixvalue : matrixvalues) {
            matrixen.add(new Matrix(matrixvalue));
        }
        if(!multiplikation(
                matrixen.get(1), matrixen.get(0)
        )) print("Not Possible");
    }

    private boolean multiplikation(Matrix matrix1, Matrix matrix2) {
        int[][] resultmatrix = new int[matrix1.getMatrix_y()][matrix2.getMatrix_y()];
        for (int y = 0; y < resultmatrix.length; y++) {
            for (int x = 0; x < resultmatrix[y].length; x++) {
                int[] _1 = matrix2.gety(x);
                int[] _2 = matrix1.getx(y);
                int result = 0;
                for (int i = 0; i < _2.length; i++) {
                    result += _1[i] * _2[i];
                }
                resultmatrix[y][x] = result;
            }
        }
        print(resultmatrix);
        return true;
    }

    public static void main(String[] args) {
        Main obj = new Main();
    }

    public static void print(String text) {
        System.out.println(text);
    }
    public static void print(int[][] array) {
        for (int[] ints : array) {
            print(Arrays.toString(ints));
        }
    }
}
