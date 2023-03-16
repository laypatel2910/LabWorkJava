package lab_3;

import java.util.Scanner;

public class Simple_Calculator_using_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press");
        System.out.println("+ for addition");
        System.out.println("- for subtraction ");
        System.out.println("* for multiplication ");
        System.out.println("/ for division ");
        char operator = sc.next().charAt(0);
        switch (operator)
        {
            case '+':
                System.out.println("How many number calculate : ");
                int number_for_addition = sc.nextInt();
                double addition = 0;
                for (int i = 1;i <= number_for_addition;i++)
                {
                    System.out.println("Enter a number " + i + " :");
                    double number = sc.nextDouble();
                    addition = addition + number;
                    if(i == number_for_addition)
                        System.out.println("Your addition is :" + addition);
                }
                break;

            case '-':
                System.out.println("How many number calculate : ");
                int number_for_subtraction = sc.nextInt();
                double subtraction = 0;
                for (int i = 1;i <= number_for_subtraction;i++)
                {
                    System.out.println("Enter a number " + i + " :");
                    double number = sc.nextDouble();
                    if(i == 1)
                        subtraction = number;
                    else
                       subtraction = subtraction - number;
                    if(i == number_for_subtraction)
                        System.out.println("Your subtraction is :" + subtraction);
                }
                break;
            case '*':
                System.out.println("How many number calculate : ");
                int number_for_multiplication = sc.nextInt();
                double multiplication = 1;
                for (int i = 1;i <= number_for_multiplication;i++)
                {
                    System.out.println("Enter a number " + i + " :");
                    double number = sc.nextDouble();
                    multiplication = multiplication * number;
                    if(i == number_for_multiplication)
                        System.out.println("Your multiplication is :" + multiplication);
                }
                break;
            case '/':
                System.out.println("How many number calculate : ");
                int number_for_division = sc.nextInt();
                double division = 1;
                for (int i = 1;i <= number_for_division;i++)
                {
                    if(i == 1)
                    {
                        System.out.println("Enter a number " + i + " :");
                        double first_number = sc.nextDouble();
                        if (first_number == 0)
                        {
                            System.out.println("Any number can not division by zero");
                            break;
                        }
                        division = first_number;
                        continue;
                    }
                    System.out.println("Enter a number " + i + " :");
                    double number = sc.nextDouble();
                    if (number == 0)
                    {
                        System.out.println("Any number can not division by zero");
                        break;
                    }
                    else {
                            division = division / number;
                    }
                    if(i == number_for_division)
                        System.out.println("Your division is :" + division);
                }
                break;

            default:
                System.out.println("Invalid operator! ");
                break;

        }

    }
}
