package Extra;

import java.util.Scanner;

public class Print_N_prime_numbers_with_their_Sum {
    static int prime_numbers(int number){
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
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        int sum = 0;
        System.out.println("Prime number :");
       for (int i = 1; i<=number; i++){
            int prime = prime_numbers(i);
            if (prime == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("The sum of prime number : " + sum);
    }
}

