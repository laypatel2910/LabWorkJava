package Extra;

import java.util.Scanner;

public class GCD_of_two_numbers_using_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 2 number to find GCD :");
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();
        int i = 1;
        int gcd = 1;
        while (number_1 >= i && number_2 >= i){
            if (number_1 % i == 0 && number_2 % i == 0){
                gcd = i;
            }
            i++;
        }
        System.out.println("GCD of " + number_1 + " and " + number_2 + " is : " + gcd );
    }
}
