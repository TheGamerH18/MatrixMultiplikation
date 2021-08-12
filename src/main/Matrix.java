package main;

import java.util.Arrays;

public class Matrix {
    private int[][] matrix;
    private int matrix_x;
    private int matrix_y;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        calcsize();
    }

    private void calcsize(){
        matrix_y = matrix.length;
        matrix_x = matrix[0].length;
    }

    public int getMatrix_x() {
        return matrix_x;
    }

    public int getMatrix_y() {
        return matrix_y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int[] gety(int index) {
        int[] result = new int[matrix_y];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][index];
        }
        return result;
    }

    public int[] getx(int index) {
        return matrix[index];
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matrix);
    }
}
