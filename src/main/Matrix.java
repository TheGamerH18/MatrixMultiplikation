package main;

import java.util.Arrays;

public class Matrix {

    // The Matrix itselg
    private final int[][] matrix;
    // X Size of the Matrix
    private int matrix_x;
    // Y Size of the Matrix
    private int matrix_y;

    /**
     * Constructor used to add the Matrix to the Obj and fill the Sizes
     * @param matrix needed Matrix
     */
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        calcsize();
    }

    /**
     * Calculates the Dimensions of the Matrix
     */
    private void calcsize(){
        matrix_y = matrix.length;
        matrix_x = matrix[0].length;
    }

    /**
     * @return the X Size of the Matrix
     */
    public int getMatrix_x() {
        return matrix_x;
    }

    /**
     * @return the Y Size of the Matrix
     */
    public int getMatrix_y() {
        return matrix_y;
    }

    /**
     * @return the Matrix itself
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * Creates an Array of the Matrix from top to bottom
     * @param index index in the Matrix
     * @return Array from the top to the bottom
     */
    public int[] gety(int index) {
        int[] result = new int[matrix_y];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][index];
        }
        return result;
    }

    /**
     * Creates an Array of the Matrix from the left to the right
     * @param index index in the Matrix
     * @return Array from the left to the right
     */
    public int[] getx(int index) {
        return matrix[index];
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matrix);
    }
}
