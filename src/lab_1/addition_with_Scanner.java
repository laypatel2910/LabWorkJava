package lab_1;

import java.util.Scanner;

public class addition_with_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 :");
        float number_1 = sc.nextFloat();
        System.out.println("Enter a number 2 :");
        float number_2 = sc.nextFloat();
        float sum = number_1 + number_2;
        System.out.println(number_1 + " + " + number_2 + " = " + sum);
    }
}
