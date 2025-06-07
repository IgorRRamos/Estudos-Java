package com.igorramos.matrizquadrada1;
import java.util.Scanner;
public class MatrizQuadrada1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int N = entrada.nextInt();
            if (N == 0) break;

            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int value = Math.min(Math.min(i, j), Math.min(N - 1 - i, N - 1 - j)) + 1;
                    matrix[i][j] = value;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j > 0) System.out.print(" ");
                    System.out.printf("%d", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }

        entrada.close();
    }
}
