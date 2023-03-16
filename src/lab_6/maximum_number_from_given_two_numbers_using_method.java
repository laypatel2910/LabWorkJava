package lab_6;

import java.util.Scanner;


public class maximum_number_from_given_two_numbers_using_method {
    float maximum_number(float x, float y) {
        // return Math.max(x, y);
        // or
        return (x>=y)?x:y;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        maximum_number_from_given_two_numbers_using_method maximum = new maximum_number_from_given_two_numbers_using_method();
        System.out.println("Enter a number1 :");
        float number_1 = sc.nextFloat();
        System.out.println("Enter a number2 :");
        float number_2 = sc.nextFloat();

        float maximum_number = maximum.maximum_number(number_1,number_2);

        System.out.println( maximum_number + " is largest number");

    }

}
