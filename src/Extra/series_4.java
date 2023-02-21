package Extra;

import java.util.Scanner;

public class series_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int sum ,Sum = 0;
        for (int i = 1;i<=number;i++){
            int e_sum = 0;
            System.out.print((i == 1)? "" : "+ " + i  + " ( ");
            for (int j = 1;j<=i;j++) {
                e_sum += (j * j);
                    System.out.print((j == i)?(j * j):(j * j) + " + ");
            }
            System.out.print((i == 1)? "" : " )");
            sum = i * e_sum;
            Sum += sum;
            System.out.print((i == number)?" = " :" ");
        }
        System.out.print(Sum);
    }
}
