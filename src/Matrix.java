public class Matrix {
    public static void main(String[] args) {

        int[][] SquareMatrix = { // двовимірний масив-матриця
                {5, 3, 7, 1},
                {2, 8, 4, 6},
                {9, 1, 3, 2},
                {4, 5, 7, 6}
        };

        int N = 4; // розмір матриці
        int sumAbove = 0; // сума вище діагоналі
        int sumBelow = 0; // сума нижче діагоналі

        for (int i = 0; i < N; i++) {        // перебираємо рядки
            for (int j = 0; j < N; j++) {    // перебираємо стовпці
                System.out.print(SquareMatrix[i][j] + "\t"); // друкуємо поточний елемент матриці
                if (j > i) {                 // елемент матриці вище головної діагоналі
                    sumAbove += SquareMatrix[i][j];
                } else if (j < i) {          // елемент матриці нижче головної діагоналі
                    sumBelow += SquareMatrix[i][j];
                }
                // якщо j == i — це елементи головної діагоналі, пропускаємо
            }
            System.out.println();
        }

        System.out.println("Сума вище діагоналі: " + sumAbove);
        System.out.println("Сума нижче діагоналі: " + sumBelow);
    }
}
