package lab_2;

import java.util.Scanner;

public class largest_number_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1 :");
        float number_1 = sc.nextFloat();
        System.out.println("Enter a number2 :");
        float number_2 = sc.nextFloat();
        System.out.println("Enter a number3 :");
        float number_3 = sc.nextFloat();
        if (number_1 >= number_2)
        {
            if(number_2 >= number_3)
            {
                System.out.println(number_1 + " is largest number");
            }
        }
        else
        {
            if(number_2 >= number_3)
            {
                System.out.println(number_2 + " is largest number");
            }
            else
            {
                System.out.println(number_3 + " is largest number");
            }
        }
    }
}
