package lab_3;

import java.util.Scanner;

public class Simple_Calculator_using_switch_case_normal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number1 : ");
        float number_1 = sc.nextFloat();
        System.out.println("enter a number2 : ");
        float number_2 = sc.nextFloat();
        System.out.println("press");
        System.out.println("+ for addition");
        System.out.println("- for subtraction ");
        System.out.println("* for multiplication ");
        System.out.println("/ for division ");
        char operator = sc.next().charAt(0);
        switch (operator)
        {
            case '+':
                float addition = number_1 + number_2;
                System.out.println("answer = " + addition);
                break;

            case '-':
                float subtraction = number_1 - number_2;
                System.out.println("answer = " + subtraction);
                break;

            case '*':
                float multiplication = number_1 * number_2;
                System.out.println("answer = " + multiplication);
                break;

            case '/':
                float division = number_1 / number_2;
                System.out.println("answer = " + division);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
}
