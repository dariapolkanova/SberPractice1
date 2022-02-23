public class MatrixDriver {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3, new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        System.out.println("Вывод исходной матрицы:");
        matrix.printMatrix();

        System.out.println("Умножение исходной матрицы на число:");
        matrix.multToNumber(5);

        System.out.println("Сложение двух матриц:");
        matrix.addToMatrix(3, 3, new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        System.out.println("Умножение двух матриц:");
        matrix.multToMatrix(3, 3, new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}});

    }
}
