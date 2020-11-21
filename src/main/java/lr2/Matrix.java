package lr2;

import java.util.Scanner;
import java.util.Random;

class Matrix {

    private int [][] array;

    private final static int MAX_SIZE = 20;

    private final static int MIN_RANDOM = 21;

    private final static int MAX_RANDOM = 45;

    private final static Scanner INPUT = new Scanner(System.in);

    public Matrix() {
        System.out.println("Введите кол-ство рядков (max "+ MAX_SIZE +"):");
        while (!INPUT.hasNextInt()) INPUT.nextLine();
        int rows = (INPUT.hasNextInt()) ? INPUT.nextInt() : 1;
        System.out.println("Введите кол-ство столбцов (max "+ MAX_SIZE +"):");
        while (!INPUT.hasNextInt()) INPUT.nextLine();
        int cols = (INPUT.hasNextInt()) ? INPUT.nextInt() : 1;
        rows = Math.min(Math.max(rows, 1), MAX_SIZE);
        cols = Math.min(Math.max(cols, 1), MAX_SIZE);
        populate(rows, cols);
    }

    private void populate(int rows, int cols) { // O(n^2)
        /**
         * @param rows - rows of matrix
         * @param cols - columns of matrix
         */
        System.out.println("Задать элементы матрицы случайно? (Y or N):");
        INPUT.nextLine();
        final boolean random = INPUT.hasNextLine() && (INPUT.nextLine().toLowerCase().equals("y"));
        array = new int [rows][cols];
        if (random) {
            Random rand = new Random();
            for (int row = 0; row < rows; row++)
                for (int col = 0; col < cols; col++)
                    array[row][col] = rand.nextInt(MAX_RANDOM - MIN_RANDOM) + MIN_RANDOM;
        } else {
            for (int row = 0; row < rows; row++)
                for (int col = 0; col < cols; col++) {
                    System.out.print("Элемент "+(row)+":"+(col)+": ");
                    while (!INPUT.hasNextInt()) INPUT.nextLine();
                    array[row][col] = INPUT.nextInt();
                }
        }
    }

    public void print_matrix() { // O(n^2)
        System.out.println("Результат:");
        for (int[] matrix : array) {
            for (int col = 0; col < array[0].length; col++)
                System.out.print(matrix[col]+" ");
            System.out.println();
        }
    }

    public void find_minimum() { // O(n^2)
        int min = array[0][0];
        for (int[] matrix : array) {
            for (int element : matrix) {
                if (element < min) {
                    min = element;
                }
            }
        }
        System.out.println("Минимальный элемент: "+ min);
    }

    public void find_maximum() { // O(n^2)
        int max = array[0][0];
        for (int[] matrix : array) {
            for (int element : matrix) {
                if (element > max) {
                    max = element;
                }
            }
        }
        System.out.println("Максимальный элемент: "+max);
    }

    public void find_average() { // O(n^2)
        int sum = 0;
        for (int [] row: array)
            for(int cell: row) sum += cell;
        System.out.println("Среднее: "+sum/(array.length*array[0].length));
    }

    public static void main(String[] args) {
        Matrix array_instance = new Matrix();
        array_instance.print_matrix();
        array_instance.find_minimum();
        array_instance.find_maximum();
        array_instance.find_average();
    }

}
