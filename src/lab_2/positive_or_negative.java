package lab_2;

import java.util.Scanner;

public class positive_or_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        float number = sc.nextFloat();
        if (number<0)
        {
            System.out.println(number + " is positive");
        }
        else if (number == 0)
        {
            System.out.println(number + " is zero");
        }
        else
        {
            System.out.println(number + " is negative");
        }
    }
}
