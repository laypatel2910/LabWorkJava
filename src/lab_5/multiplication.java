package lab_5;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column of 1st matrix");
        int matrix_1[][] = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1.length; j++) {
                System.out.println("enter a " + (i + 1) + "'s row " + (j + 1) + "'s column of 1st matrix: ");
                matrix_1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter row and column of 2nd matrix");
        int matrix_2[][] = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < matrix_2.length; i++) {
            for (int j = 0; j < matrix_2.length; j++) {
                System.out.println("Enter a " + (i + 1) + "'s row " + (j + 1) + "'s column of 2nd matrix: ");
                matrix_2[i][j] = sc.nextInt();
            }
        }
        int answer[][] = new int[matrix_1.length][matrix_2[0].length];
        if (matrix_1.length != matrix_2[0].length)
        {
            System.out.println("Multiplication not possible");
            return;
        }

        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_2[0].length; j++) {
                answer[i][j] = 0;
                for (int k = 0; k < matrix_2.length; k++) {
                    answer[i][j] += matrix_1[i][k] * matrix_2[k][j];
                }
                System.out.print( answer[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }
}
