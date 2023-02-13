package lab_5;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter row and column of matrix");
        int matrix [][] = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0;i< matrix.length;i++){
            for (int j = 0;j< matrix[0].length;j++){
                System.out.println("Enter a " + (i + 1) + "'s row " + (j + 1) + "'s column of matrix: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i< matrix.length;i++){
            System.out.print("|");
            for (int j = 0;j< matrix[0].length;j++){
                if(j < matrix[0].length && j != 0)
                    System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
            System.out.print("|");
            System.out.print("\n");
        }

    }
}

