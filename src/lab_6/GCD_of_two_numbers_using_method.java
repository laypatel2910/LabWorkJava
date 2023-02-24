package lab_6;

import java.util.Scanner;

public class GCD_of_two_numbers_using_method {
    public int gcd (int number_1, int number_2){
        int gcd = 1;
        for (int i = 1; number_1 >= i && number_2 >= i ;i++){
            if (number_1 % i == 0 && number_2 % i == 0 ){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GCD_of_two_numbers_using_method ans = new GCD_of_two_numbers_using_method();
        System.out.println("Enter a 2 number to find GCD :");
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();
        int answer = ans.gcd(number_1,number_2);
        System.out.println("GCD of " + number_1 + " and " + number_2 + " is : " + answer );
    }
}
