package lab_5;

import java.util.Scanner;

public class sum_of_the_numbers_of_each_row_and_the_sum_of_numbers_of_each_column_of_the_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column of matrix");
        int matrix [][] = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length;j++){
                System.out.println("Enter a " + (i + 1) + "'s row " + (j + 1) + "'s column of matrix: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i<matrix.length;i++){
            System.out.print("|");
            for (int j = 0;j< matrix[0].length;j++){
                if(j < matrix[0].length && j != 0)
                    System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
            System.out.print("|");
            System.out.print("\n");
        }
        int answer;
        int ANSWER;
        for (int i = 0 ; i < matrix.length ; i++) {
            answer = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                answer += matrix[i][j];
            }
            System.out.println((i + 1) + " rows sum is : " + answer);
        }

        for (int i = 0 ; i < matrix[0].length ; i++) {
            ANSWER = 0;
            for (int j = 0; j < matrix.length; j++) {
                ANSWER += matrix[j][i];
            }
            System.out.println((i + 1) + " column sum is : " + ANSWER);
        }
    }
}
