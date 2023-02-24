package lab_6;

import java.util.Scanner;

public class prime_number_using_method {
    int prime (int number){
        for (int i = 2; i*i<=number;i++)
        {
            if(number%i == 0)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not : ");
        int number = sc.nextInt();
        prime_number_using_method prime = new prime_number_using_method();
        int Prime = prime.prime(number);
        if(Prime == 0){
            System.out.println(number + " is prime number .");
        }
        else
            System.out.println(number + " is not prime number .");

    }
}
