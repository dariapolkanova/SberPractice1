public class Matrix {
    private int i;
    private int j;
    private int[][] matrix;

    Matrix(int i, int j, int[][] matrix) {
        this.i = i;
        this.j = j;
        this.matrix = matrix;
    }

    public void printMatrix() {
        for (int k = 0; k < i; k++) {
            for (int m = 0; m < j; m++) {

                System.out.print(matrix[k][m] + " ");
            }

            System.out.println();
        }
    }

    public void multToNumber(int a) {
        int[][] result = new int[i][j];

        for (int k = 0; k < i; k++) {
            for (int m = 0; m < j; m++) {
                result[k][m] = matrix[k][m] * a;
            }
        }

        for (int k = 0; k < i; k++) {
            for (int m = 0; m < j ; m++) {
                System.out.print(result[k][m] + " ");
            }
            System.out.println();
        }
    }

    public void addToMatrix(int a, int b, int[][] second_matrix) {
        int[][] result = new int[i][j];

        if (a != i | b != j) {
            System.out.println("Размер заданной матрицы не соответствует размеру исходной");
            System.out.println(String.format("Исходная матрица: %d x %d; Заданная матрица: %d x %d", i, j, a, b));
        }

        else {
            for (int k = 0; k < i; k++) {
                for (int m = 0; m < j; m++) {
                    result[k][m] = matrix[k][m] + second_matrix[k][m];
                }
            }

            for (int k = 0; k < i; k++) {
                for (int m = 0; m < j; m++) {
                    System.out.print(result[k][m] + " ");
                }
                System.out.println();
            }
        }
    }

    public void multToMatrix(int a, int b, int[][] second_matrix) {
        int[][] result = new int[i][b];

        if (j != a) {
            System.out.println("Данные матрицы нельзя перемножить");
            System.out.println(String.format("Исходная матрица: %d x %d; Заданная матрица: %d x %d", i, j, a, b));
        }

        else {
            for (int k = 0; k < i; k++) {
                for (int m = 0; m < b; m++) {
                    for (int n = 0; n < a; n++) {
                        result[k][m] += matrix[k][n] * second_matrix[n][m];
                    }
                }
            }

            for (int k = 0; k < i; k++) {
                for (int m = 0; m < j; m++) {
                    System.out.print(result[k][m] + " ");
                }
                System.out.println();
            }
        }
    }
}
