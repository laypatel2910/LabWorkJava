package lab_3;

import java.util.Scanner;

public class reverse_order {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert reverse order : ");
        int number = sc.nextInt();
        System.out.println(number + " reverse order is : ");
        for (int i = 1; number!=0; i++)
        {
            reverse = number % 10;
            number = number / 10;
            System.out.print(reverse);
        }
    }
}
