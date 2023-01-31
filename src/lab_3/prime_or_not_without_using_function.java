package lab_3;

import java.util.Scanner;

public class prime_or_not_without_using_function {
    public static void main(String[] args) {
        int prime = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not : ");
        int number = sc.nextInt();
        for (int i = 2; i*i<=number;i++)
        {
            if(number%i == 0)
            {
                prime = 1;
                break;
            }
        }
        if (prime == 0)
        {
            System.out.println(number + " is prime number .");
        }
        if (prime == 1)
        {
            System.out.println(number + " is not prime number .");
        }

    }
}
