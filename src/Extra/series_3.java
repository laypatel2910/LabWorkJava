package Extra;

import java.util.Scanner;

public class series_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1;i<=number;i++){
            System.out.print((i == 1)? "" : "+ " + "( ");
            for (int j = 1;j<=i;j++){
                sum += j;
                System.out.print((j == i)? j : j + " + " );
            }
            System.out.print((i == 1)? "" : " )");
            System.out.print((i == number)?" = " :" ");
        }
        System.out.print(sum);
    }
}
